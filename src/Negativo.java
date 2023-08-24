import java.util.Scanner;

class NegativoExce extends Exception {
    public NegativoExce() {
        super();
    }

    public NegativoExce(String texto) {
        super(texto);

    }
}

public class Negativo {
    public static void main(String[] args) {
        Scanner scanea = new Scanner(System.in);

        try {
            System.out.println("Ingresa algún número");
        double num = scanea.nextDouble();

        if (num< 0){
             throw new NegativoExce("Error: No se permiten números negativos (-)");
        } else {
            double raiz2 = Math.sqrt(num);
            System.out.println("La raiz cuadrada de " + num  + " es: " + raiz2);
        }

        } catch (NegativoExce ne) {
            System.out.println(ne.getMessage());
        } catch (Exception exce) {
            System.out.println("Hay un error" + exce.getMessage());
        } finally {
            scanea.close();
        }

    }
}