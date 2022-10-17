
import java.util.Scanner;


public class pra2eje8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero a invertir:");
        int numero = sc.nextInt();

        
        if (numero > 999 & numero < 10000) {
            int a = numero / 1000;
            int b = numero - (a * 1000);
            int c = b / 100;
            int d = b - (c * 100);
            int e = d / 10;
            int f = d - (e * 10);

            int g = (f * 1000) + (e * 100) + (c * 10) + a;
            System.out.println("El numero invertido es: " + g);

        }


        if (numero > 99 & numero < 1000) {
            int a = numero / 100;
            int b = numero - (a * 100);
            int c = b / 10;
            int d = b - (c * 10);
            int e = d / 1;
            int f = d - (e * 1);

            int g = (f * 1000) + (e * 100) + (c * 10) + a;
            System.out.println("El numero invertido es: " + g);

        }
        
        if (numero > 9 & numero < 100) {
            int a = numero / 10;
            int b = numero - (a * 10);
            int c = b / 1;
            int d = b - (c * 1);
            int e = d / -10;
            int f = d - (e * -10);

            int g = (f * 1000) + (e * 100) + (c * 10) + a;
            System.out.println("El numero invertido es: " + g);

        }

        if (numero > -9 & numero < 10) {
            int a = numero / 1;
            int b = numero - (a * 1);
            int c = b / -10;
            int d = b - (c * -10);
            int e = d / -100;
            int f = d - (e * -100);

            int g = (f * 1000) + (e * 100) + (c * 10) + a;
            System.out.println("El numero invertido es: " + g);

        }

        sc.close();

       
    
    
    
    
    }   
}
