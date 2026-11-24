package com.poo.controlador;

import java.util.List;

import com.poo.modelo.Venta;
import com.poo.modelo.Vuelo;

public class ControladorAsistente {
    private List<Vuelo> vuelos; 
    private List<Venta> ventas; 

    public ControladorAsistente(List<Vuelo> vuelos, List<Venta> ventas ){
        this.vuelos = vuelos; 
        this.ventas = ventas; 
    }
    
}
