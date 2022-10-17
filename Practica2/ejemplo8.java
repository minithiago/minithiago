import java.util.Scanner;

public class ejemplo8 {


    public static void main(String[] args) {
        
        String palabra = "";

        Scanner.sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");

        palabra = sc.nextLine;


        if (palabra.length() > 5) {
            System.out.println("Error la palabra tiene mas de 5 caracteres");

        else {

            char l1 = palabra.charAt(0);
            char l2 = palabra.charAt(1);
            char l3 = palabra.charAt(2);
            char l4 = palabra.charAt(3);
            char l5 = palabra.charAt(4);

            palabrainversa = "" + l5 + l4 + l3 + l2 + l1;

        }


        System.out.println(palabrainversa);
        }
    }
}