package com.marcelotorrezazuga.android.tiendadelibros;

import java.io.Serializable;

/**
 * Created by Marcelo Torrez on 15/11/2015.
 */
public class Documento implements Serializable{
    protected String titulo;
    protected String codigo;

    public Documento(String titulo, String codigo) {
        this.titulo = titulo;
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
