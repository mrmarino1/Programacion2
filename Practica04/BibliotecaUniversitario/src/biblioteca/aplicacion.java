package biblioteca;

public class aplicacion {

    public static void main(String[] args) {

        // <editor-fold defaultstate="collapsed" desc="Libros Creados">
        Libro l1 = new Libro("Indigno de ser humano", "978-0811204811", "Cuaderno 1");
        l1.crearPagina(70, "Cuaderno 2");
        l1.crearPagina(140, "Cuaderno 3");
        l1.crearPagina(210, "Epilogo");
        l1.mostrarInfo();
        l1.leer();
        System.out.println("");

        Libro l2 = new Libro("Crónica de una muerte anunciada", "978-0307388946", "Capitulo 1: El anuncio");
        l2.crearPagina(35, "Capitulo 2: Bayardo San Roman");
        l2.crearPagina(70, "Capitulo 3: Los hermanos Vicario");
        l2.crearPagina(105, "Capitulo 4: La autopsia");
        l2.crearPagina(135, "Capitulo 5: El final");
        l2.mostrarInfo();
        l2.leer();
        System.out.println("");

        Libro l3 = new Libro("El Principito", "978-0156012195", "Capitulo I: El dibujo");
        l3.crearPagina(15, "Capitulo IV: El asteroide B-612");
        l3.crearPagina(35, "Capitulo VIII: La rosa");
        l3.crearPagina(55, "Capitulo XXI: El zorro");
        l3.crearPagina(80, "Capitulo XXVII: Despedida");
        l3.mostrarInfo();
        l3.leer();
        System.out.println("");

        Libro l4 = new Libro("La Metamorfosis", "978-84-206-5136-1", "CAPITULO I");
        l4.crearPagina(35, "CAPITULO II");
        l4.crearPagina(68, "CAPITULO III");
        l4.mostrarInfo();
        l4.leer();
        System.out.println("");

        Libro l5 = new Libro("1984", "978-0451524935", "Parte 1: Oceanía");
        l5.crearPagina(60, "Parte 2: Julia");
        l5.crearPagina(140, "Parte 3: El Ministerio del Amor");
        l5.mostrarInfo();
        l5.leer();
        System.out.println("");
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Estudiantes Nuevos">
        Estudiante e1 = new Estudiante("1895348", "Moises Mariño");
        e1.mostrarInfo();
        System.out.println("");

        Estudiante e2 = new Estudiante("2039485", "Belen Quispe");
        e2.mostrarInfo();
        System.out.println("");

        Estudiante e3 = new Estudiante("1748291", "Maria Lopez");
        e3.mostrarInfo();
        System.out.println("");

        Estudiante e4 = new Estudiante("1983726", "Carlos Fernandez");
        e4.mostrarInfo();
        System.out.println("");

        Estudiante e5 = new Estudiante("2156473", "Ana Gutierrez");
        e5.mostrarInfo();
        System.out.println("");
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Autores Nuevos">
        Autor a1 = new Autor("Osamu Dazai", "Japones");
        a1.mostrarInfo();
        System.out.println("");

        Autor a2 = new Autor("Gabriel Garcia Marquez", "Colombiano");
        a2.mostrarInfo();
        System.out.println("");

        Autor a3 = new Autor("Antoine de Saint-Exupery", "Frances");
        a3.mostrarInfo();
        System.out.println("");

        Autor a4 = new Autor("Franz Kafka", "Checo");
        a4.mostrarInfo();
        System.out.println("");

        Autor a5 = new Autor("George Orwell", "Britanico");
        a5.mostrarInfo();
        System.out.println("");
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Bibliotecas Creadas">
        Biblioteca b1 = new Biblioteca("Biblioteca Central - UMSA");
        b1.agregarHorario("Lunes a Viernes", "08:00", "21:00");
        b1.agregarAutor(a2);
        b1.agregarAutor(a4);
        b1.agregarLibro(l5);
        b1.mostrarEstado();
        System.out.println("");
        
        
        
        Biblioteca b2 = new Biblioteca("Librería y Biblioteca del Ministerio de Educación");
        b2.mostrarEstado();
        b2.agregarLibro(l2);
        b2.agregarAutor(a3);
        b2.agregarAutor(a5);
        System.out.println("");
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Prestamos Realizados">
        b1.prestarLibro(e4, l3);
        b2.prestarLibro(e2, l2);
        
        // </editor-fold> 
    }
}
