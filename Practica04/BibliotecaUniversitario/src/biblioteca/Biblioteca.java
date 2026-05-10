package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    private ArrayList<Prestamo> prestamos;
    private Horario horario;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {
        this.libros.add(l);
    }

    public void agregarAutor(Autor a) {
        this.autores.add(a);
    }

    public void agregarHorario(String dA, String hA, String hC) {
        Horario h = new Horario(dA, hA, hC);
        this.horario = h;
    }

    public void prestarLibro(Estudiante e, Libro l) {
        if (libros.contains(l)) {
            Prestamo p = new Prestamo(e, l);
            prestamos.add(p);
            p.mostrarInfo();
        } else {
            System.out.println("El libro no esta disponible en la biblioteca");
        }
    }

    public void mostrarEstado() {
        System.out.println("Biblioteca: [" + "nombre = " + this.nombre
                + ", libros = " + this.libros.size()
                + ", autores = " + this.autores.size()
                + ", prestamos = " + this.prestamos.size() + ']');

        if (this.horario != null) {
            this.horario.mostrarHorario();
        } else {
            System.out.println("Horario: [Sin asignar]");
        }
    }

    public void cerrarBiblioteca() {
        System.out.println("La Biblioteca se cerro");
        prestamos.clear();
    }
}
