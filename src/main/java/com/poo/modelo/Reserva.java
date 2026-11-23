package com.poo.modelo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private LocalDateTime fecha; 
    private String estado; 
    private String tipo; 
    private int cantidadPersonas; 
    private List<Integer> asientos; 
    private Vuelo vuelo;
    private Cliente cliente;
    private Encomienda encomienda;
    private Venta venta;

    public Reserva(LocalDateTime fecha, String tipo, int cantidadPersonas, Vuelo vuelo, Cliente cliente) {
        this.fecha = fecha; 
        this.tipo = tipo; 
        this.cantidadPersonas = cantidadPersonas; 
        this.asientos = new ArrayList<>();
        this.vuelo = vuelo; 
        this.cliente = cliente; 
        this.estado = "pendiente"; 
    }

    public LocalDateTime getFecha(){
        return this.fecha; 
    }

    public String getEstado(){
        return this.estado; 
    }

    public String getTipo(){
        return this.tipo; 
    }

    public int getCantidadPersonas(){
        return this.cantidadPersonas; 
    }

    public List<Integer> getAsientos(){
        return this.asientos; 
    }

    public Vuelo getVuelo(){
        return this.vuelo; 
    }

    public Cliente getCliente(){
        return this.cliente; 
    }

    public Encomienda getEncomienda(){
        return this.encomienda; 
    }

    public Venta getVenta(){
        return this.venta; 
    }

    public void setEncomienda(Encomienda encomienda){
        this.encomienda = encomienda; 
    }

    public void setVenta (Venta venta){
        this.venta = venta; 
    }
}
