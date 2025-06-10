package main;

public class Paciente {
    private String nombre;
    private int edad;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getInfo() {
        return "Paciente: " + nombre + " | Edad: " + edad;
    }
}
