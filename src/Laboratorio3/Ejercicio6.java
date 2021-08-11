package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio6 {
    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        double a, b;
        double cuaA, cuaB, res1, res2, res3;
        System.out.println("Ingrese el valor de A");
        a = inicio.nextDouble();
        System.out.println("Ingrese el valor de B");
        b = inicio.nextDouble();
        cuaA = Math.pow(a, 2);
        cuaB = Math.pow(b, 2);
        System.out.println("La operacion quedarIa: "+ a + " + "+ cuaB + " = "+ cuaA + " + "+ cuaB + " + " + " 2*"+ a + " * " + b );
        res1 = a + cuaB;
        res2 = cuaA + cuaB;
        res3 = res2 + (2*a*b);
        System.out.println("InLa operacion resuelta: "+ res1 + " = " + res3);
    }
}
