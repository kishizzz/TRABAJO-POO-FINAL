package com.poo.modelo;
import java.time.LocalDateTime;

public class Venta {
    private int id; 
    private LocalDateTime fecha; 
    private String medioPago; 
    private double monto; 

    public Venta(int id, LocalDateTime fecha, String medioPago, double monto){
        this.id = id; 
        this.fecha = fecha; 
        this.medioPago = medioPago; 
        this.monto = monto; 
    }

    public int getId(){
        return this.id; 
    }

    public LocalDateTime getFecha(){
        return this.fecha; 
    }

    public String getMedioPago(){
        return this.medioPago; 
    }

    public double getMonto(){
        return this.monto; 
    }

    
}
