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
        Alumno alumno1 = new Alumno("Juan", "Soto", 2, 12345678);
        Alumno alumno2 = new Alumno("Juancho", "Pérez", 4, 23456789);
        Alumno alumno3 = new Alumno("Ana", "Gómez", 3, 34567890);
        Alumno alumno4 = new Alumno("Luis", "Ramírez", 4, 45678901);
        Alumno alumno5 = new Alumno("Marta", "López", 3, 56789012);
        
        // Asignar alumnos a las salas segun el color
        
        try {
        salaCeleste.agregarAlumno(alumno1);
        salaAzul.agregarAlumno(alumno2);
        salaVerde.agregarAlumno(alumno3);
        salaAzul.agregarAlumno(alumno4);
        salaRoja.agregarAlumno(alumno5);
        }catch(Exception e) {
        	
        System.out.println("Error al agregar alumnos a las salas: " + e.getMessage());
        	
        }
        
        System.out.println(alumno1.getNombre() + " esta asignado a la sala " + alumno1.getColorSala());
        System.out.println(alumno2.getNombre() + " esta asignado a la sala " + alumno2.getColorSala());
        System.out.println(alumno3.getNombre() + " esta asignada a la sala " + alumno3.getColorSala());
        System.out.println(alumno4.getNombre() + " esta asignado a la sala " + alumno4.getColorSala());
        System.out.println(alumno5.getNombre() + " esta asignada a la sala " + alumno5.getColorSala());
        
        salaCeleste.listaAlumnosOrdenados();
        salaVerde.listaAlumnosOrdenados();
        salaAzul.listaAlumnosOrdenados();
        salaRoja.listaAlumnosOrdenados();
        
        salaCeleste.listaAlumnosPorDNI();
        salaVerde.listaAlumnosPorDNI();
        salaAzul.listaAlumnosPorDNI();
        salaRoja.listaAlumnosPorDNI();
        
        
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
        
        try {
        	
            salaCeleste.agregarDocente(docente1);
            salaCeleste.agregarDocente(docente2);
            salaVerde.agregarDocente(docente3);
            salaVerde.agregarDocente(docente4);
            salaAzul.agregarDocente(docente5);
            salaAzul.agregarDocente(docente6);
            salaRoja.agregarDocente(docente7);
            salaRoja.agregarDocente(docente8);

            
        } 
        catch (CantidadMaximaDocentesException e) {
        	
            System.out.println(e.getMessage());
        }
        
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
        Docente docentePrimerGrado = new Docente("María", 40642178, new int[]{1});
        Docente docenteSegundoGrado = new Docente("Luis", 40642179, new int[]{2, 3, 6});
        Docente docenteTercerGrado = new Docente("Gabriel", 40642180, new int[]{3, 4});
        Docente docenteCuartoGrado = new Docente("Carlos", 40642181, new int[]{4, 5});
        Docente docenteQuintoGrado = new Docente("Beatriz", 40642182, new int[]{5, 6});
        Docente docenteSextoGrado = new Docente("David", 40642183, new int[]{6});
        

        //---Crear Alumnos Primaria
        Alumno pedroPrim = new Alumno("Pedro", "García", 7, 40642171); 
        Alumno juliaPrim = new Alumno("Julia", "Cruz", 8, 40642172); 
        Alumno carlosPrim = new Alumno("Carlos", "Reyes", 9, 40642173); 
        Alumno sofiaPrim = new Alumno("Sofia", "Hernández", 10, 40642174); 
        Alumno lucasPrim = new Alumno("Lucas", "Jiménez", 11, 40642175); 
        Alumno martaPrim = new Alumno("Marta", "Moreno", 11, 40642176); 
        Alumno juanPrim = new Alumno("Juan", "Díaz", 6, 40642177); 
        Alumno claudiaPrim = new Alumno("Claudia", "Ponce", 9, 40642178); 
        Alumno rafaelPrim = new Alumno("Rafael", "Salazar", 10, 40642179); 
        Alumno paulaPrim = new Alumno("Paula", "Vega", 11, 40642180);
        
        


        //---Cargar Alumnos Primaria
        
        try {
            segundoGrado.agregarAlumno(pedroPrim);
            tercerGrado.agregarAlumno(juliaPrim);
            tercerGrado.agregarAlumno(carlosPrim);
            cuartoGrado.agregarAlumno(sofiaPrim);
            primerGrado.agregarAlumno(juanPrim);
            sextoGrado.agregarAlumno(lucasPrim);
            sextoGrado.agregarAlumno(martaPrim);
            sextoGrado.agregarAlumno(rafaelPrim);
        }catch(Exception e) {
        	
        System.out.println("Error al agregar alumnos a las salas: " + e.getMessage());
        	
        }
        

        
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
        
        primerGrado.listaAlumnosOrdenados();
        segundoGrado.listaAlumnosOrdenados();
        tercerGrado.listaAlumnosOrdenados();
        cuartoGrado.listaAlumnosOrdenados();
        quintoGrado.listaAlumnosOrdenados();
        sextoGrado.listaAlumnosOrdenados();
        
        primerGrado.listaAlumnosPorDNI();
        segundoGrado.listaAlumnosPorDNI();
        tercerGrado.listaAlumnosPorDNI();
        cuartoGrado.listaAlumnosPorDNI();
        quintoGrado.listaAlumnosPorDNI();
        sextoGrado.listaAlumnosPorDNI();
        
        //---Agregar Docente a cada Grado
        
        try {
        	
            primerGrado.agregarDocente(docentePrimerGrado);
            segundoGrado.agregarDocente(docenteSegundoGrado);
            tercerGrado.agregarDocente(docenteTercerGrado);
            cuartoGrado.agregarDocente(docenteCuartoGrado);
            quintoGrado.agregarDocente(docenteQuintoGrado);
            sextoGrado.agregarDocente(docenteSextoGrado);
            
        } 
        catch (CantidadMaximaDocentesException e) {
        	
            System.out.println(e.getMessage());
        }
        

        
        // Asistencia primaria
        pedroPrim.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        juliaPrim.registrarAsistencia(LocalDate.of(2024, 9, 2), true);
        pedroPrim.mostrarAsistencia();
        juliaPrim.mostrarAsistencia();
        
        // Notas primaria
        docenteSegundoGrado.corregirEvaluacion(pedroPrim, "Matematicas", 8, LocalDate.of(2024, 10, 15));
        docenteTercerGrado.corregirEvaluacion(juliaPrim, "Plastica", 9, LocalDate.of(2024, 10, 16));
        docenteSegundoGrado.corregirEvaluacion(pedroPrim, "Lengua", 7, LocalDate.of(2024, 10, 17));
        docenteTercerGrado.corregirEvaluacion(juliaPrim, "Ingles", 9, LocalDate.of(2024, 10, 18));
        
        juliaPrim.mostrarNota();
        pedroPrim.mostrarNota();
        

        
      //---- Secundaria----
        
        Sala primerAño = new Sala("Primer Año", 1);
        Sala segundoAño = new Sala("Segundo Año", 2);
        Sala tercerAño = new Sala("Tercer Año", 3);
        Sala cuartoAño = new Sala("Cuarto Año", 4);
        Sala quintoAño = new Sala("Quinto Año", 5);
        Sala sextoAño = new Sala("Sexto Año", 6);
        

        //---Docentes---
        Docente docentePrimerAñoMatematicas = new Docente("Laura", 40642180, new int[]{1, 2, 3});
        Docente docentePrimerAñoLengua = new Docente("Sofía", 40642182, new int[]{1, 2, 3});
        Docente docentePrimerAñoCiencias = new Docente("Javier", 40642183, new int[]{1});

        Docente docenteSegundoAñoMatematicas = new Docente("Marcelo", 40642181, new int[]{2, 3, 6});
        Docente docenteSegundoAñoHistoria = new Docente("Ana", 40642184, new int[]{2, 3});
        Docente docenteSegundoAñoLengua = new Docente("Pedro", 40642185, new int[]{2, 3, 4});

        Docente docenteTercerAñoMatematicas = new Docente("Claudia", 40642186, new int[]{3, 4, 5});
        Docente docenteTercerAñoHistoria = new Docente("Esteban", 40642187, new int[]{3, 4});
        Docente docenteTercerAñoBiologia = new Docente("Valeria", 40642188, new int[]{3, 6});

        Docente docenteCuartoAñoMatematicas = new Docente("Fernando", 40642189, new int[]{4, 5, 6});
        Docente docenteCuartoAñoQuimica = new Docente("Martina", 40642190, new int[]{2, 4, 5});

        Docente docenteQuintoAñoMatematicas = new Docente("Roberto", 40642191, new int[]{5, 6});
        Docente docenteQuintoAñoHistoria = new Docente("Carmen", 40642192, new int[]{5});

        Docente docenteSextoAñoLengua = new Docente("Gabriel", 40642193, new int[]{6});
        Docente docenteSextoAñoCienciasSociales = new Docente("Natalia", 40642194, new int[]{6});

        //---Agregar Docentre a cada año
        
 
            primerAño.agregarDocenteSecundaria(docentePrimerAñoMatematicas);
            primerAño.agregarDocenteSecundaria(docentePrimerAñoLengua);
            primerAño.agregarDocenteSecundaria(docentePrimerAñoCiencias);
            
            segundoAño.agregarDocenteSecundaria(docenteSegundoAñoMatematicas);
            segundoAño.agregarDocenteSecundaria(docenteSegundoAñoHistoria);
            segundoAño.agregarDocenteSecundaria(docenteSegundoAñoLengua);

            tercerAño.agregarDocenteSecundaria(docenteTercerAñoMatematicas);
            tercerAño.agregarDocenteSecundaria(docenteTercerAñoHistoria);
            tercerAño.agregarDocenteSecundaria(docenteTercerAñoBiologia);

            cuartoAño.agregarDocenteSecundaria(docenteCuartoAñoMatematicas);
            cuartoAño.agregarDocenteSecundaria(docenteCuartoAñoQuimica);
            
            quintoAño.agregarDocenteSecundaria(docenteQuintoAñoMatematicas);
            quintoAño.agregarDocenteSecundaria(docenteQuintoAñoHistoria);
            
            sextoAño.agregarDocenteSecundaria(docenteSextoAñoLengua);
            sextoAño.agregarDocenteSecundaria(docenteSextoAñoCienciasSociales);
            
        

        
        
        //---Crear Alumno Secundaria 
        
        Alumno andresSecu = new Alumno("Andrés", "Gómez", 12, 40642181);
        Alumno beatrizSecu = new Alumno("Beatriz", "Pérez", 13, 40642182);
        Alumno carlosSecu = new Alumno("Carlos", "López", 14, 40642183);
        Alumno dianaSecu = new Alumno("Diana", "Martínez", 15, 40642184);
        Alumno elenaSecu = new Alumno("Elena", "Fernández", 16, 40642185);
        Alumno fernandoSecu = new Alumno("Fernando", "Sánchez", 17, 40642186);
        Alumno gustavoSecu = new Alumno("Gustavo", "Ramírez", 17, 40642187);
        Alumno helenaSecu = new Alumno("Helena", "Torres", 13, 40642188);
        Alumno ignacioSecu = new Alumno("Ignacio", "Vázquez", 16, 40642189);
        Alumno jessicaSecu = new Alumno("Jessica", "Morales", 15, 40642190);


        //---Agregar Alumno Secundaria
        
        try {
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
        }catch(Exception e) {
        	
        System.out.println("Error al agregar alumnos a las salas: " + e.getMessage());
        	
        }
        
        
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
        
        primerAño.listaAlumnosOrdenados();
        segundoAño.listaAlumnosOrdenados();
        tercerAño.listaAlumnosOrdenados();
        cuartoAño.listaAlumnosOrdenados();
        quintoAño.listaAlumnosOrdenados();
        sextoAño.listaAlumnosOrdenados();
        
        primerAño.listaAlumnosPorDNI();
        segundoAño.listaAlumnosPorDNI();
        tercerAño.listaAlumnosPorDNI();
        cuartoAño.listaAlumnosPorDNI();
        quintoAño.listaAlumnosPorDNI();
        sextoAño.listaAlumnosPorDNI();
        
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
        andresSecu.registrarAsistencia(LocalDate.of(2024, 9, 2), false);

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
        docenteSegundoAñoMatematicas.corregirEvaluacion(beatrizSecu, "Matematica", 8, LocalDate.of(2024, 10, 15));
        docenteTercerAñoBiologia.corregirEvaluacion(gustavoSecu, "Biologia", 9, LocalDate.of(2024, 10, 16));
        docenteSegundoAñoLengua.corregirEvaluacion(jessicaSecu, "Lengua", 7, LocalDate.of(2024, 10, 17));
        docenteTercerAñoHistoria.corregirEvaluacion(jessicaSecu, "Historia", 9, LocalDate.of(2024, 10, 18));
        docentePrimerAñoMatematicas.corregirEvaluacion(andresSecu, "Matematica", 10, LocalDate.of(2024, 10, 19));
        docenteSegundoAñoHistoria.corregirEvaluacion(carlosSecu, "Historia", 6, LocalDate.of(2024, 10, 20));
        docenteTercerAñoMatematicas.corregirEvaluacion(dianaSecu, "Matematica", 7, LocalDate.of(2024, 10, 21));
        docenteQuintoAñoHistoria.corregirEvaluacion(elenaSecu, "Historia", 8, LocalDate.of(2024, 10, 22));
        docenteSextoAñoLengua.corregirEvaluacion(fernandoSecu, "Lengua", 9, LocalDate.of(2024, 10, 23));
        docenteCuartoAñoQuimica.corregirEvaluacion(helenaSecu, "Química", 7, LocalDate.of(2024, 10, 24));
        docenteQuintoAñoMatematicas.corregirEvaluacion(ignacioSecu, "Matematica", 6, LocalDate.of(2024, 10, 25));

        
        beatrizSecu.mostrarNota();
        jessicaSecu.mostrarNota();
        gustavoSecu.mostrarNota();
        
        //BUSCAR ALUMNO POR DNI
        
        int dniBuscado = 40642172;
        
        
        try {
            Alumno alumnoEncontrado = segundoGrado.buscarAlumnoPorDNI(dniBuscado);
            
            System.out.println("Alumno encontrado: " + alumnoEncontrado.getApellido() + " " + alumnoEncontrado.getNombre() + " - DNI: " + alumnoEncontrado.getDni());
            
        } catch (AlumnoNoEncontradoException e) {
        	
            System.out.println(e.getMessage());
        }
        

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

