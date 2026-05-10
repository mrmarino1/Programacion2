package biblioteca;

public class Horario {

    private String diasApertura, horaApertura, horaCierre;

    public Horario(String diasApertura, String horaApertura, String horaCierre) {
        this.diasApertura = diasApertura;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    public void mostrarHorario() {
        System.out.println("Horario: [Dias de apertura = " + diasApertura + ", Apertura = " + horaApertura + ", Cierre = " + horaCierre + "]");
    }
}
