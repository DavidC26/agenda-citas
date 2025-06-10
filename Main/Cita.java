package main;

public class Cita {
    private Paciente paciente;
    private Medico medico;
    private String fecha;

    public Cita(Paciente paciente, Medico medico, String fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }

    public String getInfo() {
        return fecha + " - " + paciente.getInfo() + " con " + medico.getInfo();
    }
}
