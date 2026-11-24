package com.poo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {

        Label mensaje = new Label("Bienvenido a POO");

        TextField nombre = new TextField();
        nombre.setPromptText("Ingrese su nombre");

        Button boton = new Button("Saludar");

        boton.setOnAction(event -> {
            String texto = nombre.getText();
            mensaje.setText("Hola " + texto);
        });

        VBox root = new VBox(15, mensaje, nombre, boton);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("JavaFX con Maven");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}