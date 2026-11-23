package com.poo.modelo;
import java.time.LocalDateTime;

public class Encomienda {
    private double pesoKg; 
    private LocalDateTime fechaEntrega; 
    private double precio; 

    public Encomienda(double pesoKg, LocalDateTime fechaEntrega){
        this.pesoKg = pesoKg; 
        this.fechaEntrega = fechaEntrega; 
        this.precio = 0; 
    }

    public double getPesoKg(){
        return this.pesoKg; 
    }

    public LocalDateTime getFechaEntrega(){
        return this.fechaEntrega; 
    }

    public double getPrecio(){
        return this.precio; 
    }
}
