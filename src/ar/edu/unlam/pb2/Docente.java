package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Docente extends Persona { 

    private int[] gradoExperiencia;


    public Docente(String nombre, Integer dni, int[] gradoExperiencia) {
    	
        super(nombre, dni);
        this.gradoExperiencia = gradoExperiencia;
    }
    @Override
    public String getNombre() {
    	
        return super.getNombre();
    }
    @Override
    public Integer getDni() {
    	
        return super.getDni();
    }

    public int[] getGradoExperiencia() {
    	
        return gradoExperiencia;
    }

    public boolean puedeCorregir(Alumno alumno) {
        int gradoAlumno = alumno.getGradoAsignado();
        
        for (int i = 0; i < gradoExperiencia.length; i++) {
        	
            if (gradoExperiencia[i] == gradoAlumno) {
            	
                return true;
            }
        }
        return false;
    }

    public void corregirEvaluacion(Alumno alumno, String curso, int nota, LocalDate fecha) {
        if (puedeCorregir(alumno)) {
        	
            Evaluacion evaluacion = new Evaluacion(fecha, curso, nota);
            alumno.registrarNota(evaluacion);
            
            System.out.println("\nEvaluación de " + alumno.getNombre() + " fue corregida por el docente " + getNombre() + ": " + curso + " - Nota: " + nota + " - Fecha: " + fecha);
        } else {
        	
            System.out.println("\nEl docente " + getNombre() + " no puede corregir el examen de " + alumno.getNombre());
        }
    }
}
