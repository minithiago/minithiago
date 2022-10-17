import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        double radio = 0;
        

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        
        radio = entrada.nextDouble();

        double longitud = (2 * Math.PI * radio);
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);
        System.out.println("Volumen: " + volumen);





    }
    
}
