package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.util.ArrayList; 

public class Alumno extends Persona { 
    private int edad;
    private String apellido;
    private String colorSala;
    private ArrayList<Asistencia> asistencias; 
    private ArrayList<Evaluacion> evaluaciones; 
    private int gradoAsignado;

    
    public Alumno(String nombre, String apellido, int edad, Integer dni) {
        super(nombre, dni); 
        this.apellido = apellido;
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
 
    public String getApellido() {
        return apellido;
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
        
        for (int i = 0; i < asistencias.size(); i++) {
        	
            if (asistencias.get(i).getFecha().equals(fecha)) {
            	
                System.out.println("Asistencia de "+getNombre()+ " "+getApellido()+ " ya registrada en la fecha: " + fecha);
                
                return;
            }
        }
        
        
        
        
        asistencias.add(new Asistencia(fecha, asistio));
        
        System.out.println("Asistencia de "+getNombre()+" "+getApellido()+ " se regristro correctamente en la fecha: " + fecha);
    }

    public void mostrarAsistencia() {
        System.out.println("\nAsistencias de " + getNombre() + ":");
        for (int i = 0; i < asistencias.size(); i++) {
            Asistencia asistencia = asistencias.get(i);
            System.out.println("Fecha: " + asistencia.getFecha() + " - Asistio: " + (asistencia.getAsistio() ? "Si" : "No"));
        }
    }

    
    public void registrarNota(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion); 
    }

    public void mostrarNota() {
        System.out.println("\nEvaluaciones de " + getNombre() + ":");
        for (Evaluacion eval : evaluaciones) { 
            System.out.println("Curso: " + eval.getCurso() + " - Nota: " + eval.getNota() + " - Fecha: " + eval.getFecha());
        }
    }
    
    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }
}


