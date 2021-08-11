package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio2 {
    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        float sueldo, horas, resultado;
        System.out.println("Ingrese el sueldo por hora y las horas trabajadas");
        System.out.println("Sueldo por hora: "); sueldo = inicio.nextFloat();
        System.out.println("Horas trabajadas: "); horas = inicio.nextFloat();
        resultado = sueldo * horas;
        System.out.println("El sueldo es de: " + resultado);
    }
}
