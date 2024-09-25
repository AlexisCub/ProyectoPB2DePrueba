package ar.edu.unlam.pb2;
import java.time.LocalDate;

public class InterfaceInstituto {

    public static void main(String[] args) {
        //---- Jardin ----
        Sala salaCeleste = new Sala("Sala Celeste", 0); 
        Sala salaVerde = new Sala("Sala Verde", 0);
        Sala salaAzul = new Sala("Sala Azul", 0);
        Sala salaRoja = new Sala("Sala Roja", 0);
        
        //---- Jardin ----
        Alumno alumno1 = new Alumno("Juan", 2, 12345678);
        Alumno alumno2 = new Alumno("Juancho", 4, 23456789);
        Alumno alumno3 = new Alumno("Ana", 3, 34567890);
        Alumno alumno4 = new Alumno("Luis", 4, 45678901);
        Alumno alumno5 = new Alumno("Marta", 3, 56789012);
        
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
        Docente docente1 = new Docente("Andrea", 40642171, new int[]{0});
        Docente docente2 = new Docente("Alicia", 40642172, new int[]{0});
        Docente docente3 = new Docente("Martina", 40642173, new int[]{0});
        Docente docente4 = new Docente("Diana", 40642174, new int[]{0});
        Docente docente5 = new Docente("Rocio", 40642175, new int[]{0});
        Docente docente6 = new Docente("Araceli", 40642176, new int[]{0});
        Docente docente7 = new Docente("Cande", 40642177, new int[]{0});
        Docente docente8 = new Docente("Ricardo", 40642178, new int[]{0});


        
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
        
        //---Aulas primaria----
        Sala primerGrado = new Sala("Pimer Grado", 1);
        Sala segundoGrado = new Sala("Segundo Grado", 2);
        Sala tercerGrado = new Sala("Tercer Grado", 3); 
        Sala cuartoGrado = new Sala("Cuarto Grado", 4);
        Sala quintoGrado = new Sala("Quinto Grado", 5);
        Sala sextoGrado = new Sala("Sexto Grado", 6);
        
        //---Crear Docente primaria---
        Docente docentePrimerGrado = new Docente("Mar�a", 40642178, new int[]{1});
        Docente docenteSegundoGrado = new Docente("Luis", 40642179, new int[]{2, 3, 6});
        Docente docenteTercerGrado = new Docente("Gabriel", 40642180, new int[]{3, 4});
        Docente docenteCuartoGrado = new Docente("Carlos", 40642181, new int[]{4, 5});
        Docente docenteQuintoGrado = new Docente("Beatriz", 40642182, new int[]{5, 6});
        Docente docenteSextoGrado = new Docente("David", 40642183, new int[]{6});
        

        //---Crear Alumnos Primaria
        Alumno pedroPrim = new Alumno("Pedro", 7, 40642171); 
        Alumno juliaPrim = new Alumno("Julia", 8, 40642172); 
        Alumno carlosPrim = new Alumno("Carlos", 9, 40642173); 
        Alumno sofiaPrim = new Alumno("Sofia", 10, 40642174); 
        Alumno lucasPrim = new Alumno("Lucas", 11, 40642175); 
        Alumno martaPrim = new Alumno("Marta", 11, 40642176); 
        Alumno juanPrim = new Alumno("Juan", 6, 40642177); 
        Alumno claudiaPrim = new Alumno("Claudia", 9, 40642178); 
        Alumno rafaelPrim = new Alumno("Rafael", 10, 40642179); 
        Alumno paulaPrim = new Alumno("Paula", 11, 40642180);

        //---Cargar Alumnos Primaria
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
        
        //---Agregar Docente a cada Grado
        primerGrado.agregarDocente(docentePrimerGrado);
        segundoGrado.agregarDocente(docenteSegundoGrado);
        tercerGrado.agregarDocente(docenteTercerGrado);
        cuartoGrado.agregarDocente(docenteCuartoGrado);
        quintoGrado.agregarDocente(docenteQuintoGrado);
        sextoGrado.agregarDocente(docenteSextoGrado);
        
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
        
        Sala primerA�o = new Sala("Primer A�o", 1);
        Sala segundoA�o = new Sala("Segundo A�o", 2);
        Sala tercerA�o = new Sala("Tercer A�o", 3);
        Sala cuartoA�o = new Sala("Cuarto A�o", 4);
        Sala quintoA�o = new Sala("Quinto A�o", 5);
        Sala sextoA�o = new Sala("Sexto A�o", 6);
        

        //---Docentes---
        Docente docentePrimerA�oMatematicas = new Docente("Laura", 40642180, new int[]{1, 2, 3});
        Docente docentePrimerA�oLengua = new Docente("Sof�a", 40642182, new int[]{1, 2, 3});
        Docente docentePrimerA�oCiencias = new Docente("Javier", 40642183, new int[]{1});

        Docente docenteSegundoA�oMatematicas = new Docente("Marcelo", 40642181, new int[]{2, 3, 6});
        Docente docenteSegundoA�oHistoria = new Docente("Ana", 40642184, new int[]{2, 3});
        Docente docenteSegundoA�oLengua = new Docente("Pedro", 40642185, new int[]{2, 3, 4});

        Docente docenteTercerA�oMatematicas = new Docente("Claudia", 40642186, new int[]{3, 4, 5});
        Docente docenteTercerA�oHistoria = new Docente("Esteban", 40642187, new int[]{3, 4});
        Docente docenteTercerA�oBiologia = new Docente("Valeria", 40642188, new int[]{3, 6});

        Docente docenteCuartoA�oMatematicas = new Docente("Fernando", 40642189, new int[]{4, 5, 6});
        Docente docenteCuartoA�oQuimica = new Docente("Martina", 40642190, new int[]{2, 4, 5});

        Docente docenteQuintoA�oMatematicas = new Docente("Roberto", 40642191, new int[]{5, 6});
        Docente docenteQuintoA�oHistoria = new Docente("Carmen", 40642192, new int[]{5});

        Docente docenteSextoA�oLengua = new Docente("Gabriel", 40642193, new int[]{6});
        Docente docenteSextoA�oCienciasSociales = new Docente("Natalia", 40642194, new int[]{6});

        //---Agregar Docentre a cada a�o
        primerA�o.agregarDocente(docentePrimerA�oMatematicas);
        primerA�o.agregarDocente(docentePrimerA�oLengua);
        primerA�o.agregarDocente(docentePrimerA�oCiencias);
        
        segundoA�o.agregarDocente(docenteSegundoA�oMatematicas);
        segundoA�o.agregarDocente(docenteSegundoA�oHistoria);
        segundoA�o.agregarDocente(docenteSegundoA�oLengua);

        tercerA�o.agregarDocente(docenteTercerA�oMatematicas);
        tercerA�o.agregarDocente(docenteTercerA�oHistoria);
        tercerA�o.agregarDocente(docenteTercerA�oBiologia);

        cuartoA�o.agregarDocente(docenteCuartoA�oMatematicas);
        cuartoA�o.agregarDocente(docenteCuartoA�oQuimica);
        
        quintoA�o.agregarDocente(docenteQuintoA�oMatematicas);
        quintoA�o.agregarDocente(docenteQuintoA�oHistoria);
        
        sextoA�o.agregarDocente(docenteSextoA�oLengua);
        sextoA�o.agregarDocente(docenteSextoA�oCienciasSociales);
        //---Crear Alumno Secundaria 
        Alumno andresSecu = new Alumno("Andr�s", 12, 40642181);
        Alumno beatrizSecu = new Alumno("Beatriz", 13, 40642182);
        Alumno carlosSecu = new Alumno("Carlos", 14, 40642183);
        Alumno dianaSecu = new Alumno("Diana", 15, 40642184);
        Alumno elenaSecu = new Alumno("Elena", 16, 40642185);
        Alumno fernandoSecu = new Alumno("Fernando", 17, 40642186);
        Alumno gustavoSecu = new Alumno("Gustavo", 17, 40642187);
        Alumno helenaSecu = new Alumno("Helena", 13, 40642188);
        Alumno ignacioSecu = new Alumno("Ignacio", 16, 40642189);
        Alumno jessicaSecu = new Alumno("Jessica", 15, 40642190);

        //---Agregar Alumno Secundaria
        primerA�o.agregarAlumno(andresSecu);
        segundoA�o.agregarAlumno(beatrizSecu);
        tercerA�o.agregarAlumno(carlosSecu);
        cuartoA�o.agregarAlumno(dianaSecu);
        quintoA�o.agregarAlumno(elenaSecu);
        sextoA�o.agregarAlumno(fernandoSecu);
        sextoA�o.agregarAlumno(gustavoSecu);
        segundoA�o.agregarAlumno(helenaSecu);
        quintoA�o.agregarAlumno(ignacioSecu);
        cuartoA�o.agregarAlumno(jessicaSecu);
        
        System.out.println("\nA�o asignado a los alumnos de secundaria:");
        System.out.println(andresSecu.getNombre() + ": A�o " + andresSecu.getGradoAsignado());
        System.out.println(beatrizSecu.getNombre() + ": A�o " + beatrizSecu.getGradoAsignado());
        System.out.println(carlosSecu.getNombre() + ": A�o " + carlosSecu.getGradoAsignado());
        System.out.println(dianaSecu.getNombre() + ": A�o " + dianaSecu.getGradoAsignado());
        System.out.println(elenaSecu.getNombre() + ": A�o " + elenaSecu.getGradoAsignado());
        System.out.println(fernandoSecu.getNombre() + ": A�o " + fernandoSecu.getGradoAsignado());
        System.out.println(gustavoSecu.getNombre() + ": A�o " + gustavoSecu.getGradoAsignado());
        System.out.println(helenaSecu.getNombre() + ": A�o " + helenaSecu.getGradoAsignado());
        System.out.println(ignacioSecu.getNombre() + ": A�o " + ignacioSecu.getGradoAsignado());
        System.out.println(jessicaSecu.getNombre() + ": A�o " + jessicaSecu.getGradoAsignado());

        System.out.println("\nLista de alumnos por a�o:");
        primerA�o.mostrarAlumnos();
        segundoA�o.mostrarAlumnos();
        tercerA�o.mostrarAlumnos();
        cuartoA�o.mostrarAlumnos();
        quintoA�o.mostrarAlumnos();
        sextoA�o.mostrarAlumnos();
        
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
        docenteSegundoA�oMatematicas.corregirEvaluacion(beatrizSecu, "Matematicas", 8); 
        docenteTercerA�oBiologia.corregirEvaluacion(gustavoSecu, "Biologia", 9); 
        docenteSegundoA�oLengua.corregirEvaluacion(jessicaSecu, "Lengua", 7); 
        docenteTercerA�oHistoria.corregirEvaluacion(jessicaSecu, "Historia", 9);
        docentePrimerA�oMatematicas.corregirEvaluacion(andresSecu, "Matematicas", 10);
        docenteSegundoA�oHistoria.corregirEvaluacion(carlosSecu, "Historia", 6);
        docenteTercerA�oMatematicas.corregirEvaluacion(dianaSecu, "Matematicas", 7);
        docenteQuintoA�oHistoria.corregirEvaluacion(elenaSecu, "Historia", 8);
        docenteSextoA�oLengua.corregirEvaluacion(fernandoSecu, "Lengua", 9);
        docenteCuartoA�oQuimica.corregirEvaluacion(helenaSecu, "Qu�mica", 7);
        docenteQuintoA�oMatematicas.corregirEvaluacion(ignacioSecu, "Matematicas", 6);
        
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

