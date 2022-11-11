package Condicionales;
import java.util.Scanner;

public class Condicionales {
    private static Scanner sc = new Scanner(System.in); {
        
    }
    public Condicionales(String nombre)
        
{
        System.out.printl(x: "Hola"+ nombre+ "desde el constructor de Condicionales");
    //Inicializar variables
    } 
    
    /*
     * Ejercicio 1
     * Escribir un programa que pregunte al usuario su edad y muestre por pantalla que es mayor de edad o no.
// privacidad, tipo de retorno, nombre de la funcion o metodo*/

public String saludo(){
    system.out.print(s: "Ingresa tu edad: ");
    int edad = sc.nextInt();
    sc.close();

    if(edad>=18){
        return "Eres mayor de edad";
    } else{
        return "Eres menor de edad";
    }
    }
    public String e2Contrasenia(){
        System.out.print(s: "Ingresa la contraseña: ");
        String pass = sc.nextline();
        return pass.equials(passBD) ;
    }
}

/*Escribir un programa que pida al usuario dos numeros y muestre por pantalla su division. Si el divisor es cero el programa
 * debe mostrar un error
 * @return La division y si el divisor es CERO, ERROR
*/
public void e3(){
    System.out.print(s: "Ingresa al dividendo: ");
    double dividendo = sc.nexDouble();
    System.out.print(s: "Ingresa al divisor: ");
    double divisor = sc.nextDouble();

    if(divisor != 0){
        return "La division de "+dividendo+"/"+divisor+" = "+(dividendo/divisor);
    }else{
        return "Error el divisor es cero";


    }
    }

}

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
        numero = pantalla.
    }
}