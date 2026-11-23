package com.poo.modelo;

public class Cliente {
    private String nombre; 
    private boolean esPersonalEmergencia; 
    
    public Cliente(String nombre, boolean esPersonalEmergencia){
        this.nombre = nombre; 
        this.esPersonalEmergencia = esPersonalEmergencia; 


    }

    public String getNombre(){
        return this.nombre; 
    }

    public boolean getEsPersonalEmergencia(){
        return this.esPersonalEmergencia; 
    }
}
