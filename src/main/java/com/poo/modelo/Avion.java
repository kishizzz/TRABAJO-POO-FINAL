package com.poo.modelo;

public class Avion {
    private String tipoAvion; 
    private int cantidadAsientos; 
    private double pesoMaximo; 

    public Avion (String tipoAvion, int cantidadAsientos, double pesoMaximo){
        this.tipoAvion = tipoAvion; 
        this.cantidadAsientos = cantidadAsientos; 
        this.pesoMaximo = pesoMaximo; 
    }


    public String getTipoAvion(){
        return this.tipoAvion; 
    }

    public int getCantidadAsientos(){
        return this.cantidadAsientos; 
    }

    public double getPesoMaximo(){
        return this.pesoMaximo; 
    }
}
