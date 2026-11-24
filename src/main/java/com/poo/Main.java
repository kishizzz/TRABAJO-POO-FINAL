package com.poo;
import java.util.List;
import java.util.ArrayList;
import com.poo.modelo.Destino;
import com.poo.modelo.Gerente;
import com.poo.controlador.ControladorGerente;
import com.poo.modelo.Asistente;
import com.poo.modelo.Avion;
import java.time.LocalDateTime;
import com.poo.modelo.Vuelo;
import com.poo.modelo.Venta;
import com.poo.controlador.ControladorAsistente;

public class Main{
    public static void main(String[] args) {
    List<Destino> destinos = new ArrayList<>();

    destinos.add(new Destino("Cochamó", 20000, 5000));
    destinos.add(new Destino("Puelo bajo", 20000, 5000));
    destinos.add(new Destino("Contao", 20000, 5000));
    destinos.add(new Destino("Rio Negro", 25000, 6000));
    destinos.add(new Destino("Pupelde", 25000, 6000));
    destinos.add(new Destino("Chepu", 30000, 8000));
    destinos.add(new Destino("Ayacara", 30000, 8000));
    destinos.add(new Destino("Pillan", 40000, 12000));
    destinos.add(new Destino("Reñihue", 40000,12000));
    destinos.add(new Destino("Isla Quenac", 40000, 12000));
    destinos.add(new Destino("Palqui", 40000, 12000));
    destinos.add(new Destino("Chaiten", 50000, 15000));
    destinos.add(new Destino("Santa Barbara", 50000, 15000));

    List<Avion> aviones = new ArrayList<>();
    aviones.add(new Avion("CESSNA 310", 5, 910));
    aviones.add(new Avion("CESSNA 208 CARAVAN ", 9, 1315));
    aviones.add(new Avion("LET 410 UVP-E20", 19, 1800));

    List<Vuelo> vuelos = new ArrayList<>();
    vuelos.add(new Vuelo(1, destinos.get(0), aviones.get(1), "Programado", LocalDateTime.of(2026, 12, 1, 9, 0), LocalDateTime.of(2026, 12, 1, 10, 0), false));
    vuelos.add(new Vuelo(2, destinos.get(1), aviones.get(2), "Programado", LocalDateTime.of(2026, 12, 4, 9, 0), LocalDateTime.of(2026, 12, 4, 11, 0), false));
    vuelos.add(new Vuelo(3, destinos.get(2), aviones.get(0), "Programado", LocalDateTime.of(2026, 12, 1, 9, 0), LocalDateTime.of(2026, 12, 1, 10, 0), false));
    vuelos.add(new Vuelo(4, destinos.get(0), aviones.get(2), "Programado", LocalDateTime.of(2026, 12, 1, 9, 0), LocalDateTime.of(2026, 12, 1, 10, 0), true));

    System.out.println("Vuelos cargados: " + vuelos.size());
    for (Vuelo v : vuelos) {
    System.out.println(v.getId() + " - " + v.getDestino().getNombre()
        + " - " + v.getAvion().getTipoAvion()
        + " - " + v.getFechaSalida()
        + " - " + v.getEstado());
}

    List<Venta> ventas = new ArrayList<>();
    System.out.println("Ventas registradas: " + ventas.size());

    Gerente gerente = new Gerente("Nombre del gerente");
    Asistente asistente = new Asistente("Nombre del asistente");

    ControladorGerente controladorGerente = new ControladorGerente(vuelos, ventas);
    ControladorAsistente controladorAsistente = new ControladorAsistente(vuelos, ventas);

    System.out.println("Vuelos del gerente: " + controladorGerente.verVuelosYDisponibilidad().size());
    System.out.println("Asistente creado: " + (asistente != null));
    System.out.println("Controlador asistente creado: " + (controladorAsistente != null));
}
}