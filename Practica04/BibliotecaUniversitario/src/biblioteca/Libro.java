package biblioteca;

import java.util.ArrayList;

public class Libro {

    private String titulo, isbn;
    private ArrayList<Pagina> paginas;

    public Libro(String titulo, String isbn, String contenidoInicial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
        this.paginas.add(new Pagina(1, contenidoInicial));
    }

    public void crearPagina(int numero, String contenido) {
        Pagina p = new Pagina(numero, contenido);
        paginas.add(p);
    }

    public void mostrarInfo() {
        System.out.println("Libro: [titulo = " + titulo + ", isbn = " + isbn + "]");
    }

    public void leer() {
        for (Pagina pagina : paginas) {
            pagina.mostrarPagina();
        }
    }

    public String getTitulo() {
        return titulo;
    }
}
