
package ejerciciossemana9;

import java.util.Scanner;
public class Ejercicios1semana9 {
/*
    Programa que nos da una secuencia de numero y los clasifica 
    si el numero es par o impar 
    
    datos:
    de 1 hasta 10
    respuesta:
    1 es impar
    2 es par 
    3 es impar
    4 es par
    5 es impar
    6 es par
    7 es impar
    8 es par 
    9 es impar
    10 es par
    
    */
    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero mayor a 1:");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
    }
}