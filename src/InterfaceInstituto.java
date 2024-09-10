import java.time.LocalDate;

public class InterfaceInstituto {

    public static void main(String[] args) {
        //---- Jardin ----
        Sala salaCeleste = new Sala("Sala Celeste", 0); 
        Sala salaVerde = new Sala("Sala Verde", 0);
        Sala salaAzul = new Sala("Sala Azul", 0);
        Sala salaRoja = new Sala("Sala Roja", 0);
        
        Alumno alumno1 = new Alumno("Juan", 2);
        Alumno alumno2 = new Alumno("Juancho", 4);
        Alumno alumno3 = new Alumno("Ana", 3);
        Alumno alumno4 = new Alumno("Luis", 4);
        Alumno alumno5 = new Alumno("Marta", 5);

        // Asignar alumnos a las salas segun el color
        salaCeleste.agregarAlumno(alumno1);
        salaAzul.agregarAlumno(alumno2);
        salaVerde.agregarAlumno(alumno3);
        salaAzul.agregarAlumno(alumno4);
        salaRoja.agregarAlumno(alumno5);
        
        System.out.println(alumno1.getNombre() + " esta asignado a la sala " + alumno1.getColorSala());
        System.out.println(alumno2.getNombre() + " esta asignado a la sala " + alumno2.getColorSala());
        System.out.println(alumno3.getNombre() + " esta asignada a la sala " + alumno3.getColorSala());
        System.out.println(alumno4.getNombre() + " esta asignado a la sala " + alumno4.getColorSala());
        System.out.println(alumno5.getNombre() + " esta asignada a la sala " + alumno5.getColorSala());
        
        // Crear docentes de Jardin
        Docente docente1 = new Docente("Andrea", new int[]{0});
        Docente docente2 = new Docente("Alicia", new int[]{0});
        Docente docente3 = new Docente("Martina", new int[]{0});
        Docente docente4 = new Docente("Diana", new int[]{0});
        Docente docente5 = new Docente("Rocio", new int[]{0});
        Docente docente6 = new Docente("Araceli", new int[]{0});
        Docente docente7 = new Docente("Cande", new int[]{0});
        Docente docente8 = new Docente("Ricardo", new int[]{0});
        
        // Asignar docentes a las salas
        salaCeleste.agregarDocente(docente1);
        salaCeleste.agregarDocente(docente2);
        salaVerde.agregarDocente(docente3);
        salaVerde.agregarDocente(docente4);
        salaAzul.agregarDocente(docente5);
        salaAzul.agregarDocente(docente6);
        salaRoja.agregarDocente(docente7);
        salaRoja.agregarDocente(docente8);
        
        System.out.println("\nMostrar lista de alumnos de jardin:");
        salaCeleste.mostrarAlumnos();
        salaVerde.mostrarAlumnos();
        salaAzul.mostrarAlumnos();
        salaRoja.mostrarAlumnos();
        
        hayMenosDeDies(new Sala[]{salaCeleste, salaVerde, salaAzul, salaRoja});
        
        // Asistencia jardin
        alumno1.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        alumno2.registrarAsistencia(LocalDate.of(2024, 9, 2), false);
        alumno3.registrarAsistencia(LocalDate.of(2024, 9, 2), false);
        alumno4.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        alumno5.registrarAsistencia(LocalDate.of(2024, 9, 2), false);
        System.out.println("\nLista de asistencia:");
        alumno1.mostrarAsistencia();
        alumno2.mostrarAsistencia();
        alumno3.mostrarAsistencia();
        alumno4.mostrarAsistencia();
        alumno5.mostrarAsistencia();
        
        
        
        
        
        //---- Primaria----
        
        Sala primerGrado = new Sala("Pimer Grado", 1);
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Sala tercerGrado = new Sala("Tercer Grado", 3);
        Sala cuartoGrado = new Sala("Cuarto Grado", 4);
        Sala quintoGrado = new Sala("Quinto Grado", 5);
        Sala sextoGrado = new Sala("Sexto Grado", 6);
        
        Docente docentePrimerGrado = new Docente("Maria", new int[]{1, 3, 5});
        Docente docenteSegundoGrado = new Docente("Luis", new int[]{2, 3, 6});
        Docente docenteTercerGrado = new Docente("Gabriel", new int[]{3, 4});
        Docente docenteCuartoGrado = new Docente("Carlos", new int[]{4, 5});
        Docente docenteQuintoGrado = new Docente("Beatriz", new int[]{5, 6});
        Docente docenteSextoGrado = new Docente("David", new int[]{6});
        
        Alumno pedroPrim = new Alumno("Pedro", 7);
        Alumno juliaPrim = new Alumno("Julia", 8);
        Alumno carlosPrim = new Alumno("Carlos", 9);
        Alumno sofiaPrim = new Alumno("Sofia", 10);
        Alumno lucasPrim = new Alumno("Lucas", 11);
        Alumno martaPrim = new Alumno("Marta", 11);
        Alumno juanPrim = new Alumno("Juan", 6);
        Alumno claudiaPrim = new Alumno("Claudia", 9);
        Alumno rafaelPrim = new Alumno("Rafael", 10);
        Alumno paulaPrim = new Alumno("Paula", 11);
        
        primerGrado.agregarAlumno(pedroPrim);
        segundoGrado.agregarAlumno(juliaPrim);
        tercerGrado.agregarAlumno(carlosPrim);
        cuartoGrado.agregarAlumno(sofiaPrim);
        sextoGrado.agregarAlumno(lucasPrim);
        sextoGrado.agregarAlumno(martaPrim);
        sextoGrado.agregarAlumno(rafaelPrim);
        
        System.out.println("\nGrado asignado a los alumnos de primaria:");
        System.out.println(pedroPrim.getNombre() + ": Grado " + pedroPrim.getGradoAsignado());
        System.out.println(juliaPrim.getNombre() + ": Grado " + juliaPrim.getGradoAsignado());
        System.out.println(carlosPrim.getNombre() + ": Grado " + carlosPrim.getGradoAsignado());
        System.out.println(sofiaPrim.getNombre() + ": Grado " + sofiaPrim.getGradoAsignado());
        System.out.println(lucasPrim.getNombre() + ": Grado " + lucasPrim.getGradoAsignado());
        System.out.println(martaPrim.getNombre() + ": Grado " + martaPrim.getGradoAsignado());
        System.out.println(juanPrim.getNombre() + ": Grado " + juanPrim.getGradoAsignado());
        System.out.println(claudiaPrim.getNombre() + ": Grado " + claudiaPrim.getGradoAsignado());
        System.out.println(rafaelPrim.getNombre() + ": Grado " + rafaelPrim.getGradoAsignado());
        System.out.println(paulaPrim.getNombre() + ": Grado " + paulaPrim.getGradoAsignado());
        
        System.out.println("\nLista de alumnos por grado:");
        primerGrado.mostrarAlumnos();
        segundoGrado.mostrarAlumnos();
        tercerGrado.mostrarAlumnos();
        cuartoGrado.mostrarAlumnos();
        quintoGrado.mostrarAlumnos();
        sextoGrado.mostrarAlumnos();
        
        // Asistencia primaria
        pedroPrim.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        juliaPrim.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        pedroPrim.mostrarAsistencia();
        juliaPrim.mostrarAsistencia();
        
        // Notas primaria
        docenteSegundoGrado.corregirEvaluacion(pedroPrim, "Matematicas", 8);
        docenteTercerGrado.corregirEvaluacion(juliaPrim, "Plastica", 9);
        docenteSegundoGrado.corregirEvaluacion(pedroPrim, "Lengua", 7);
        docenteTercerGrado.corregirEvaluacion(juliaPrim, "Ingles", 9);
        
        juliaPrim.mostrarNota();
        pedroPrim.mostrarNota();
        
        
        
        
        
      //---- Secundaria----
        
        Sala primerAño = new Sala("Primer Año", 1);
        Sala segundoAño = new Sala("Segundo Año", 2);
        Sala tercerAño = new Sala("Tercer Año", 3);
        Sala cuartoAño = new Sala("Cuarto Año", 4);
        Sala quintoAño = new Sala("Quinto Año", 5);
        Sala sextoAño = new Sala("Sexto Año", 6);
        
        Docente docentePrimerAño = new Docente("Ana", new int[]{1, 3, 5});
        Docente docenteSegundoAño = new Docente("Marcelo", new int[]{2, 3, 6});
        Docente docenteTercerAño = new Docente("Sofía", new int[]{3, 4, 6});
        Docente docenteCuartoAño = new Docente("Diego", new int[]{4, 5});
        Docente docenteQuintoAño = new Docente("Lucía", new int[]{5, 6});
        Docente docenteSextoAño = new Docente("Javier", new int[]{6});
        
        Alumno andresSecu = new Alumno("Andrés", 12);
        Alumno beatrizSecu = new Alumno("Beatriz", 13);
        Alumno carlosSecu = new Alumno("Carlos", 14);
        Alumno dianaSecu = new Alumno("Diana", 15);
        Alumno elenaSecu = new Alumno("Elena", 16);
        Alumno fernandoSecu = new Alumno("Fernando", 17);
        Alumno gustavoSecu = new Alumno("Gustavo", 17);
        Alumno helenaSecu = new Alumno("Helena", 13);
        Alumno ignacioSecu = new Alumno("Ignacio", 16);
        Alumno jessicaSecu = new Alumno("Jessica", 15);
        
        primerAño.agregarAlumno(andresSecu);
        segundoAño.agregarAlumno(beatrizSecu);
        tercerAño.agregarAlumno(carlosSecu);
        cuartoAño.agregarAlumno(dianaSecu);
        quintoAño.agregarAlumno(elenaSecu);
        sextoAño.agregarAlumno(fernandoSecu);
        sextoAño.agregarAlumno(gustavoSecu);
        segundoAño.agregarAlumno(helenaSecu);
        quintoAño.agregarAlumno(ignacioSecu);
        cuartoAño.agregarAlumno(jessicaSecu);
        
        System.out.println("\nAño asignado a los alumnos de secundaria:");
        System.out.println(andresSecu.getNombre() + ": Año " + andresSecu.getGradoAsignado());
        System.out.println(beatrizSecu.getNombre() + ": Año " + beatrizSecu.getGradoAsignado());
        System.out.println(carlosSecu.getNombre() + ": Año " + carlosSecu.getGradoAsignado());
        System.out.println(dianaSecu.getNombre() + ": Año " + dianaSecu.getGradoAsignado());
        System.out.println(elenaSecu.getNombre() + ": Año " + elenaSecu.getGradoAsignado());
        System.out.println(fernandoSecu.getNombre() + ": Año " + fernandoSecu.getGradoAsignado());
        System.out.println(gustavoSecu.getNombre() + ": Año " + gustavoSecu.getGradoAsignado());
        System.out.println(helenaSecu.getNombre() + ": Año " + helenaSecu.getGradoAsignado());
        System.out.println(ignacioSecu.getNombre() + ": Año " + ignacioSecu.getGradoAsignado());
        System.out.println(jessicaSecu.getNombre() + ": Año " + jessicaSecu.getGradoAsignado());

        System.out.println("\nLista de alumnos por año:");
        primerAño.mostrarAlumnos();
        segundoAño.mostrarAlumnos();
        tercerAño.mostrarAlumnos();
        cuartoAño.mostrarAlumnos();
        quintoAño.mostrarAlumnos();
        sextoAño.mostrarAlumnos();
        
        //Asistencia secundaria
        andresSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        beatrizSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), false);
        carlosSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        dianaSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        elenaSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), false);
        fernandoSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        gustavoSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        helenaSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), false);
        ignacioSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        jessicaSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), false);

        // Mostrar asistencia secundaria
        andresSecu.mostrarAsistencia();
        beatrizSecu.mostrarAsistencia();
        carlosSecu.mostrarAsistencia();
        dianaSecu.mostrarAsistencia();
        elenaSecu.mostrarAsistencia();
        fernandoSecu.mostrarAsistencia();
        gustavoSecu.mostrarAsistencia();
        helenaSecu.mostrarAsistencia();
        ignacioSecu.mostrarAsistencia();
        jessicaSecu.mostrarAsistencia();

        // Notas secundaria
        docenteSegundoAño.corregirEvaluacion(beatrizSecu, "Matematicas", 8);
        docenteTercerAño.corregirEvaluacion(gustavoSecu, "Plastica", 9);
        docenteSegundoAño.corregirEvaluacion(jessicaSecu, "Lengua", 7);
        docenteTercerAño.corregirEvaluacion(jessicaSecu, "Ingles", 9);
        
        beatrizSecu.mostrarNota();
        jessicaSecu.mostrarNota();
        gustavoSecu.mostrarNota();

    }

    public static void hayMenosDeDies(Sala[] salas) {
        for (int i = 0; i < salas.length; i++) {
            Sala sala = salas[i];
            if (sala.getCantidadAlumnos() < 10) {
                System.out.println("\nLa sala " + sala.getNombre() + " tiene menos de 10 alumnos.");
            }
        }
    }
}

