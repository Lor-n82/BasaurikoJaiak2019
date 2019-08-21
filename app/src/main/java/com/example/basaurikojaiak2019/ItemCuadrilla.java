package com.example.basaurikojaiak2019;

public class ItemCuadrilla {

    String nombreCuadrilla,descripcion,fecha;
    int foto;

    public ItemCuadrilla() {
    }

    public ItemCuadrilla(String nombreCuadrilla, String descripcion, String fecha, int foto) {
        this.nombreCuadrilla = nombreCuadrilla;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreCuadrilla() {
        return nombreCuadrilla;
    }

    public void setNombreCuadrilla(String nombreCuadrilla) {
        this.nombreCuadrilla = nombreCuadrilla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
