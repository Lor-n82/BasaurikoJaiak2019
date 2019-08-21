package com.example.basaurikojaiak2019;

public class Item {

    String titulo,descripcion,fecha;
    int foto;

    public Item(String titulo, String descripcion, String fecha, int foto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Item() {
    }
}
