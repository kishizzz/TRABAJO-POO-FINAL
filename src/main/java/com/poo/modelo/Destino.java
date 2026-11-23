package com.poo.modelo;

public class Destino {
    private String nombre; 
    private double precioPasaje; 
    private double precioPorKgEncomienda;

    public Destino(String nombre, double precioPasaje, double precioPorKgEncomienda ){
        this.nombre = nombre; 
        this.precioPasaje = precioPasaje; 
        this.precioPorKgEncomienda = precioPorKgEncomienda; 
    }

    public String getNombre(){
        return this.nombre; 
    }

    public double getPrecioPasaje(){
        return this.precioPasaje; 
    }

    public double getprecioPorKgEncomienda(){
        return this.precioPorKgEncomienda; 
    }
    
}
