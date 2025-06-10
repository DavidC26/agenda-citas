package main;

public class Medico {
    private String nombre;
    private String especialidad;

    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getInfo() {
        return "Dr. " + nombre + " | Especialidad: " + especialidad;
    }
}
