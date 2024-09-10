public class Sala {

    private String nombre;
    private Alumno[] alumnos;
    private int contAlumnos;
    private Docente[] docentes;
    private int contDocentes;

    public Sala(String nombre, int nivel) {
        this.nombre = nombre;
        this.alumnos = new Alumno[20];
        this.contAlumnos = 0;
        this.contDocentes = 0;
        
        if (nivel == 0) {
            this.docentes = new Docente[2];
        } 
        else {
            if (nivel >= 1) {
                this.docentes = new Docente[1];
            } 

        }

    }
    
    public void agregarAlumno(Alumno nuevoAlumno) {
        if (contAlumnos < alumnos.length) {
            alumnos[contAlumnos] = nuevoAlumno;
            contAlumnos++;
        } else {
            System.out.println("Capacidad maxima de alumnos ");
        }
    }
    
    public void agregarDocente(Docente nuevoDocente) {
        if (contDocentes < docentes.length) {
            docentes[contDocentes] = nuevoDocente;
            contDocentes++;
        } else {
            System.out.println("Capacidad Maxima de docentes");
        }
    }
    
    public void mostrarAlumnos() {
        System.out.println(nombre + " tiene " + contAlumnos + " alumnos");
    }
    
    public int getCantidadAlumnos() {
        return contAlumnos;
    }
    
    public String getNombre() {
        return nombre;
    }
}
