package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio5 {
    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        float partici, parcial1, parcial2, parcialfinal, notaFinal;
        System.out.println("Ingrese nota de la participacion");
        partici = inicio.nextFloat();
        System.out.println("Ingrese nota del primer parcial");
        parcial1 = inicio.nextFloat();
        System.out.println("Ingrese nota del segundo parcial");
        parcial2 = inicio.nextFloat();
        System.out.println("Ingrese nota del parcial final");
        parcialfinal = inicio.nextFloat();
        partici *= 0.10f;
        parcial1 *= 0.25f;
        parcial2 *= 0.25f;
        parcialfinal *= 0.40f;
        notaFinal = partici + parcial1 + parcial2 + parcialfinal;
        System.out.println("La nota obtenida fue: " + notaFinal);
    }
}
