
import java.util.Scanner;

public class pra2ej7 {

    public static void main(String[] args){

        

        double L1 = 0;
        double L2 = 0;
        double L3 = 0;
       
        double area = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer lado: ");
        L1 = sc.nextDouble();

        System.out.println("Introduce el segundo lado: ");
        L2 = sc.nextDouble();

        System.out.println("Introduce el tercer lado: ");
        L3 = sc.nextDouble();

        double Sp = ((L1 + L2 + L3) / 2);
        area = Math.sqrt(Sp * ((Sp-L1) * (Sp-L2) * (Sp-L3)));


        System.out.println("Area del triangulo: " + area);

        sc.close();




        



    }
    
}
