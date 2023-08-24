import java.util.Scanner;

public class Uno {

    public static char CharEn (String cadena, int lugar) throws Exception {
        if(lugar >=0 && lugar<cadena.length()){
            return cadena.charAt(lugar);
        } else {
            throw new Exception("No se encuentra este caracter");
        }
    }

    public static void main(String[] args) {
        String cadena= "Tarea de Desarrollo";
        int lugar=6;

        try{
            char resultado = CharEn(cadena,lugar);
            System.out.println("La letra en el " + lugar + " es: " + resultado);
        } catch (Exception exception){
            System.out.println("Error:" + exception.getMessage());
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase: ");
        String lectTeclado= scan.nextLine();

        try {
            char resulta= CharEn(lectTeclado,6);
            System.out.println("La letra en esta posición es: " + resulta);
        } catch (Exception exception){
            System.out.println("El caracter que se busca no existe");
        }
        scan.close();
    }


}
























