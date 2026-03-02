package principal;
import java.util.Random;
public class Principal {
    public static void main(String[] args) {
        Random rand = new Random();
        int min = 1;
        int max = 100000;
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            int num = rand.nextInt((max-min) + 1) + min;
            a[i] = num;
        }
        
        Cronometro cr = new Cronometro();
        cr.inicia();
        for (int i = 0; i < a.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambio
            int temp = a[indiceMinimo];
            a[indiceMinimo] = a[i];
            a[i] = temp;
        }
        cr.detener();
        System.out.println("Lapso de tiempo: "+cr.lapsoDeTiempo());
    }    
}