package modelo;

import java.time.LocalDate;

public class Tarea {
    // Variables
    private String nombre;
    private String descripcion;
    private LocalDate fecha_entrega;
    private String prioridad;
    private String estado;

    // Constructores
    public Tarea() {}
    public Tarea(String nombre, String descripcion, LocalDate fecha_entrega, String prioridad, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_entrega = fecha_entrega;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    // Getters && setters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String newDescripcion) {
        this.descripcion = newDescripcion;
    }
    
    public LocalDate getFecha_entrega() {
        return this.fecha_entrega;
    }
    public void setFecha_entrega(LocalDate newFecha_entrega) {
        this.fecha_entrega = newFecha_entrega;
    }
    
    public String getPrioridad() {
        return this.prioridad;
    }
    public void setPrioridad(String newPrioridad) {
        this.prioridad = newPrioridad;
    }
    
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String newEstado) {
        this.estado = newEstado;
    }

    @Override
    public String toString() {
        return "Tarea [nombre=" + nombre 
        + ", descripcion=" + descripcion 
        + ", fecha_entrega=" + fecha_entrega
        + ", prioridad=" + prioridad 
        + ", estado=" + estado 
        + "]";
    }
}
