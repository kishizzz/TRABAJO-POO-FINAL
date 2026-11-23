package com.poo.controlador;
import com.poo.modelo.Vuelo;
import com.poo.modelo.Venta;
import java.util.List;

public class Gerente {
    private List<Vuelo> vuelos;
    private List<Venta> ventas;

    public Gerente(List<Vuelo> vuelos, List<Venta> ventas){
        this.vuelos = vuelos; 
        this.ventas = ventas; 
    }

    public List<Vuelo> verVuelosYDisponibilidad(){
        return this.vuelos; 
    }
    
}
