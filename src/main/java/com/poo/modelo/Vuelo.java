package com.poo.modelo;
import java.time.LocalDateTime;

public class Vuelo {
    private int id;
    private Destino destino; 
    private Avion avion; 
    private String estado; 
    private LocalDateTime fechaSalida; 
    private LocalDateTime fechaLlegada; 
    private double pesoAcumulado; 
    private boolean esExtraordinario; 

    public Vuelo(int id, Destino destino, Avion avion, String estado, LocalDateTime fechaSalida, LocalDateTime fechaLlegada, boolean esExtraordinario){
        this.id = id; 
        this.destino = destino; 
        this.avion = avion; 
        this.estado = estado; 
        this.fechaSalida = fechaSalida; 
        this.fechaLlegada = fechaLlegada; 
        this.pesoAcumulado = 0; 
        this.esExtraordinario = esExtraordinario; 
    }

    public int getId(){
        return this.id; 
    }

    public Destino getDestino(){
        return this.destino; 
    }

    public Avion getAvion(){
        return this.avion; 
    }

    public String getEstado(){
        return this.estado; 
    }

    public LocalDateTime getFechaSalida(){
        return this.fechaSalida; 
    }

    public LocalDateTime getFechaLlegada(){
        return this.fechaLlegada; 
    }

    public double getPesoAcumulado(){
        return this.pesoAcumulado; 
    }

    public boolean getEsExtraordinario(){
        return this.esExtraordinario; 
    }

    public boolean hayDisponibilidad(int cantidad){
        //esto necesita una lista de reservas que aun no existe, esta en "proceso" pero se agrega para que coincida con el UML
        return false;
    }

    public boolean agregarPeso(double kg){
        return false;
    }
                                                    //los metodos aun estan en proceso pero se añaden para coincidir con el UML
    public double calcularCapacidadRestante(){
        return 0;
    }

}
