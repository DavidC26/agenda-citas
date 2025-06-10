package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Cita> citas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Agendar cita\n2. Mostrar citas\n3. Salir");
            System.out.print("Elige una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    agendarCita();
                    break;
                case "2":
                    mostrarCitas();
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    static void agendarCita() {
        System.out.print("Nombre del paciente: ");
        String nombrePaciente = scanner.nextLine();
        System.out.print("Edad del paciente: ");
        int edadPaciente = Integer.parseInt(scanner.nextLine());
        System.out.print("Nombre del médico: ");
        String nombreMedico = scanner.nextLine();
        System.out.print("Especialidad del médico: ");
        String especialidad = scanner.nextLine();
        System.out.print("Fecha de la cita (ej. 2025-06-10): ");
        String fecha = scanner.nextLine();

        Paciente paciente = new Paciente(nombrePaciente, edadPaciente);
        Medico medico = new Medico(nombreMedico, especialidad);
        Cita cita = new Cita(paciente, medico, fecha);
        citas.add(cita);

        System.out.println("✅ Cita agendada correctamente.");
    }

    static void mostrarCitas() {
        if (citas.isEmpty()) {
            System.out.println("No hay citas agendadas.");
        } else {
            System.out.println("Citas agendadas:");
            for (Cita c : citas) {
                System.out.println(c.getInfo());
            }
        }
    }
}
