package ar.edu.unlam.pb2;

import java.time.LocalDate;

public class Evaluacion {

	private LocalDate fecha;
    private String curso;
    private int nota;

    public Evaluacion(LocalDate fecha, String curso, int nota) {
        this.fecha = fecha;
        this.curso = curso;
        this.nota = nota;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public String getCurso() {
    	return curso;
    }

    public int getNota() {
        return nota; 
    }
}
