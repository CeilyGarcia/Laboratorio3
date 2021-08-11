package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio7 {
    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        int horasTotal, semanas, dias, horas;
        System.out.println("Cual es el total de numero que desea medir en s,d,h");
        horasTotal = inicio.nextInt();
        semanas=horasTotal /168;
        dias=horasTotal%168 /24;
        horas= horasTotal%24;
        System.out.println("el total de semanas es: " + semanas);
        System.out.println("El total de días es: " + dias);
        System.out.println("El total de horas es de: " + horas);
    }
}
