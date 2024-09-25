package ar.edu.unlam.pb2;
import java.time.LocalDate;

public class Asistencia {

    private LocalDate fecha;
    private boolean asistio;

    public Asistencia(LocalDate fecha, boolean asistio) {
        this.fecha = fecha;
        this.asistio = asistio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean getAsistio() {
        return asistio;
    }
}
