package com.marcelotorrezazuga.android.tiendadelibros;

import java.io.Serializable;

/**
  Created by Marcelo Torrez on 15/11/2015.
 */
public class Libro extends Documento implements Serializable{

    private double precio;

    public Libro(String a, String b, double c) {
        super(a,b);
        precio = c;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro: "+ titulo+" "+codigo+" "+precio;
    }
}
