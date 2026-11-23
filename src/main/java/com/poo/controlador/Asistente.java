package com.poo.controlador;

import java.util.List;
import com.poo.modelo.Vuelo;
import com.poo.modelo.Venta;

public class Asistente {
    private List<Vuelo> vuelos; 
    private List<Venta> ventas; 

    public Asistente(List<Vuelo> vuelos, List<Venta> ventas ){
        this.vuelos = vuelos; 
        this.ventas = ventas; 
    }
    
}
