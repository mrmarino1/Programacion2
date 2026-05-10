package biblioteca;

import java.util.Date;

public class Prestamo {
    
    private Date fechaPrestamo, fechaDevolucion;
    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = new Date();
        this.fechaDevolucion = new Date(this.fechaPrestamo.getTime() + 7L * 24 * 60 * 60 * 1000);
    }
    
    public void mostrarInfo(){
        System.out.println("El estudiante: "+estudiante.getNombre()+", se presto el libro: "+libro.getTitulo());
    }    
}