
import java.util.Scanner;

public class pra2ej3 {
    public static void main(String[] args) {
        double millas = 0;

        double metros = 1852;

        double Distancia = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número de millas: ");

        millas = sc.nextDouble();

        Distancia = millas * metros;

        System.out.println("En metros es: " + Distancia + " metros");
    }
    
}
