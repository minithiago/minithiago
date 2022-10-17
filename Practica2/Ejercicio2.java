import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        double precioreal = 0;
        double preciodesc = 0;
        double descuento;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el precio real: ");
        precioreal = entrada.nextDouble();
        System.out.print("Introduce el precio ya descontado: ");
        preciodesc = entrada.nextDouble();


        descuento = ((preciodesc * 100) / precioreal) ;


        System.out.print("El descuento aplicado es: " + (100 - descuento) + "%");




    }
    
}
