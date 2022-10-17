
import java.util.Scanner;



public class pra2ej6 {

    public static void main(String[] args) {

        double Suma;
        double Resta;
        double Multiplicacion;
        double Division;
        double potencia;
        double Raiz_cuadrada;
        double num1 = 0;
        double num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        num1 = sc.nextDouble();

        System.out.println("Introduce un segundo número: ");
        num2 = sc.nextDouble();

        Suma = num1 + num2;
        Resta = num1 - num2;
        Multiplicacion = num1 * num2;
        Division = num1 / num2;
        potencia = Math.pow(num1, 2);
        Raiz_cuadrada = Math.sqrt(num1);

        System.out.println("La suma es: " + Suma);
        System.out.println("La resta es: " + Resta);
        System.out.println("La multiplicacion es: " + Multiplicacion);
        System.out.println("La division es: " + Division);
        System.out.println("La potencia es: " + potencia);
        System.out.println("La raiz cuadrada es: " + Raiz_cuadrada);



    }


    
}
