package biblioteca;

public class Estudiante {

    private String codigo, nombre;

    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: [codigo = " + codigo + ", nombre = " + nombre + "]");
    }

    public String getNombre() {
        return nombre;
    }
}
