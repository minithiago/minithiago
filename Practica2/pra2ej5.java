import java.util.Scanner;

public class pra2ej5 {

    public static void main(String[] args) {

        double C2 = 0;

        double C1 = 0;

        double x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        C1 = sc.nextDouble();

        System.out.println("Introduce un segundo número: ");
        C2 = sc.nextDouble();

        x = (-(C2)/C1);

        System.out.println("La solucion de x es: " + x);

        sc.close();


        

    }
    
}
