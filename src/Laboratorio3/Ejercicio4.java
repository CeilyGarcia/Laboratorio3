package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio4 {
    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        double salario = 1000;
        double comision = 150;
        double salarioTotal, cantidadCarro, total1, precioCarro, total2;
        System.out.println("Ingrese la cantidad de carros vendidos");
        cantidadCarro = inicio.nextDouble();
        System.out.println("Ingrese el precio de los carros vendidos");
        precioCarro = inicio.nextDouble();
        total1 = precioCarro * 0.05;
        total2 = cantidadCarro * comision;
        salarioTotal = salario + total1 + total2;
        System.out.println("El salario del empleado es: " + salarioTotal);
    }
}
