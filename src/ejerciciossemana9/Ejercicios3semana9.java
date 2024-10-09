
package ejerciciossemana9;
import java.util.Scanner;
public class Ejercicios3semana9 {
    /*
    Realizar un algoritmo que nos indique la suma de los 
    numeros pares empezando desde el numero 2 en adelante
    datos:
    n=10
    2+4+6+ 8+10
    respuesta:
    suma=30
    */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = leer.nextInt();
        int suma = 0;

        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }

        System.out.println("Suma de los numeros pares es: " + suma);
    }

}
