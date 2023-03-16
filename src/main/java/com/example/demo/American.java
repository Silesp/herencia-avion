package com.example.demo;

import java.util.Date;

public class American extends Avion{

    private String ruta;
    private int repeticion;

    private Date fecha;

    public American(String codigoA, String modelo, int cantPasaje, String color, Boolean exito) {
        super(codigoA, modelo, cantPasaje, color, exito);
        this.ruta = ruta;
        this.repeticion = repeticion;
        this.fecha = fecha;
    }

    public void cantVuelo(int v) {
        System.out.println(v);
    }
    public void cantVuelo(double x){
        System.out.println("Esta es la sobrecarga: " +x);
    }

    public void cantVuelo(double y, int x){
    System.out.println("Esta es la segunda sobrecarga: " +y +" "+x);
    }
    }
