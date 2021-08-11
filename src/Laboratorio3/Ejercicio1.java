package Laboratorio3;
import java.util.Scanner;
/**
 *
 * @author Ceily
 */
public class Ejercicio1 {

    public static void main(String[] args) 
    {
        Scanner inicio= new Scanner(System.in);
        int nota1, nota2, nota3, resultado; 
        System.out.println("Digite 3 calificaciones: ");
 
        System.out.println("Nota 1: "); nota1=inicio.nextInt();
        System.out.println("Nota 2: "); nota2=inicio.nextInt();
        System.out.println("Nota 3: "); nota3=inicio.nextInt();
        resultado = nota1 + nota2 + nota3;
        System.out.println("El resultado es: " + resultado);
    }
    
}
