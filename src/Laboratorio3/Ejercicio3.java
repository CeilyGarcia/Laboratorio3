package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio3 {
    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        double rodrigo, andrea, esteban;
        System.out.println("Ingrese la cantidad de dolares que posee rodrigo");
        rodrigo = inicio.nextDouble();
        andrea= rodrigo/2;
        esteban = ((rodrigo+andrea)/2);
        System.out.println("La cantidad de dolares de Rodrigo son: $" + rodrigo);
        System.out.println("La cantidad de dolares de Andrea son: $" + andrea);
        System.out.println("La cantidad de dolares de Esteban son: $" + esteban);
    }
}
