package biblioteca;

public class Pagina {

    public int getNumero() {
        return numero;
    }

    public String getContenido() {
        return contenido;
    }

    private int numero;
    private String contenido;

    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

    public void mostrarPagina() {
        System.out.println("Pagina: [numero = " + numero + ", contenido = " + contenido + "]");
    }
}
