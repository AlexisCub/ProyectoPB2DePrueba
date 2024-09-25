package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.util.ArrayList; 

public class Alumno extends Persona { 
    private int edad;
    private String colorSala;
    private ArrayList<Asistencia> asistencias; 
    private ArrayList<Evaluacion> evaluaciones; 
    private int gradoAsignado;

    
    public Alumno(String nombre, int edad, Integer dni) {
        super(nombre, dni); 
        this.edad = edad;
        this.colorSala = asignarColorSala(edad);
        asistencias = new ArrayList<Asistencia>(); 
        evaluaciones = new ArrayList<Evaluacion>(); 
        this.gradoAsignado = asignarGrado();
    }

    private String asignarColorSala(int edad) {
        if (edad <= 2) {
            return "Celeste";
        } else {
            if (edad == 3) {
                return "Verde";
            } else {
                if (edad == 4) {
                    return "Azul";
                } else {
                    if (edad == 5) {
                        return "Roja";
                    } else {
                        return "";
                    }
                }
            }
        }
    }

    private int asignarGrado() {
        if (edad >= 6 && edad <= 11) {
            return edad - 5;
        } else {
            if (edad >= 12 && edad <= 17) {
                return edad - 11;
            } else {
                return 0;
            }
        }
    }

    
    public int getEdad() {
        return edad;
    }

    public String getColorSala() {
        return colorSala;
    }

    public int getGradoAsignado() {
        return gradoAsignado;
    }

    
    public void registrarAsistencia(LocalDate fecha, boolean asistio) {
        asistencias.add(new Asistencia(fecha, asistio));
    }

    public void mostrarAsistencia() {
        System.out.println("\nAsistencias de " + getNombre() + ":");
        for (Asistencia asistencia : asistencias) { 
            System.out.println("Fecha: " + asistencia.getFecha() + " - Asistio: " + (asistencia.getAsistio() ? "Si" : "No"));
        }
    }

    
    public void registrarNota(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion); 
    }

    public void mostrarNota() {
        System.out.println("\nEvaluaciones de " + getNombre() + ":");
        for (Evaluacion eval : evaluaciones) { 
            System.out.println("Materia: " + eval.getMateria() + " // Nota: " + eval.getNota());
        }
    }
}
