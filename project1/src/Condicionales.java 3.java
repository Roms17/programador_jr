package Condicionales;
import java.util.Scanner;

public class Condicionales {
    private static Scanner sc = new Scanner(System.in); {
        
    }
    public Condicionales(String nombre)
        
{
        System.out.printl(x: "Hola"+ nombre+ "desde el constructor de Condicionales");
 
/*Ejercicio 4
 * Escribir un programa que pida al usuario un numero entero y muestre por pantalla
 * si es par o impar
 */

public class NumeroPar {
    public static void main(String[]args)
    {
        int numero;
        Scanner pantalla = new Scanner(System.in);
        System.out.print("Introduce un numero entero: "); 
        numero = pantalla.nextInt();

        if (numero % 2 == 0)
        {
            System.out.print("Es un numero par" );
        }
        else
        { 
            System.out.print( "Es un numero impar" );
        }
    }
}

/*Ejercicio 5
 * Para pagar un determinado impuesto se debe ser mayor de 16 años y tener unos ingresos
 * iguales o superopres a $5000 mensuales. Escribir un programa que pregunte al usuario su edad
 * y sus ingresos mensuales y muestre por pantalla si el usuario 
 * tiene que paar o no.
 */