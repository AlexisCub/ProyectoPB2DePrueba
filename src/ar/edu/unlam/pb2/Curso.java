package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Curso {

    private ArrayList<Alumno> alumnos;
    private ArrayList<Docente> docentes;

    public Curso() {
        this.alumnos = new ArrayList<Alumno>();
        this.docentes = new ArrayList<Docente>();
    }

    public void agregarAlumno(Alumno nuevoAlumno) throws AlumnoInscriptoException{
        for (int i = 0; i < alumnos.size(); i++) {
        	
            if (alumnos.get(i).getDni() == nuevoAlumno.getDni()){
            	
                throw new AlumnoInscriptoException("El alumno con DNI " + nuevoAlumno.getDni() + " ya esta inscrito");
            }
        }
        alumnos.add(nuevoAlumno);
        System.out.println("Alumno " + nuevoAlumno.getNombre() + " agregado al curso");
    }

    public void mostrarAlumnos() {
        System.out.println("Los alumnos del curso son: ");
        
        for (int i = 0; i < alumnos.size(); i++) {
        	
            Alumno alumno = alumnos.get(i);
            System.out.println(alumno.getApellido() + " " + alumno.getNombre());
        }
    }

    public int getCantidadAlumnos(){
        return alumnos.size();
    }

    public ArrayList<Docente> getDocentes(){
        return docentes;
    }

    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }

    public void agregarDocente(Docente nuevoDocente) throws CantidadMaximaDocentesException {
    	
        docentes.add(nuevoDocente);
        
        System.out.println("Docente " + nuevoDocente.getNombre() + " asignado al curso");
    }
}
