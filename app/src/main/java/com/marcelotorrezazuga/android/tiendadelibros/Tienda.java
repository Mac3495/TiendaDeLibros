package com.marcelotorrezazuga.android.tiendadelibros;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Marcelo Torrez on 15/11/2015.
 */
public class Tienda implements Serializable{

    private String nombre;
    private int telefono;
    private ArrayList<Libro> listaLibros;

    public Tienda(String nombre, int telefono, ArrayList<Libro> listaLibros) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.listaLibros = listaLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", listaLibros=" + listaLibros +
                '}';
    }
}
