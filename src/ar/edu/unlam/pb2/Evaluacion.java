package ar.edu.unlam.pb2;
public class Evaluacion {

    private String materia;
    private int nota;

    public Evaluacion(String materia, int nota) {
        this.materia = materia;
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public int getNota() {
        return nota; 
    }
}
