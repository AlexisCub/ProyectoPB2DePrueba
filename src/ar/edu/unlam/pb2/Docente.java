package ar.edu.unlam.pb2;

public class Docente extends Persona { 

    private int[] gradoExperiencia;


    public Docente(String nombre, Integer dni, int[] gradoExperiencia) {
        super(nombre, dni);
        this.gradoExperiencia = gradoExperiencia;
    }

    public String getNombre() {
        return super.getNombre();
    }

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

    public void corregirEvaluacion(Alumno alumno, String materia, int nota) {
        if (puedeCorregir(alumno)) {
            Evaluacion evaluacion = new Evaluacion(materia, nota);
            alumno.registrarNota(evaluacion);
            System.out.println("\nEvaluación de " + alumno.getNombre() + " fue corregida por el docente " + getNombre() + ": " + materia + " // Nota: " + nota);
        } else {
            System.out.println("\nEl docente " + getNombre() + " no puede corregir el examen de " + alumno.getNombre());
        }
    }
}
