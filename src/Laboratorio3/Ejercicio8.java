package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio8 {
    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        int a,b,c;
        double res1, res2, res3;
        System.out.println("Ingrese los valores de la ecuacion");
        System.out.println("Valor de A");
        a = inicio.nextInt();
        System.out.println("Valor de B");
        b = inicio.nextInt();
        System.out.println("Valor de C");
        c = inicio.nextInt();
        res1 = Math.sqrt((Math.pow(b, 2) - (4*a*c)));
        res2 = ((-b) + res1) / (2*a);
        res3 = ((-b) - res1) / (2*a);
        System.out.println("X1 = " + res2);
        System.out.println("X2 = " + res3);
   }
}
