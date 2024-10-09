/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossemana9;

import java.util.Scanner;
public class Ejercicios2semana9 {
    /*
    Calificaión de las notas de los estudiantes de un colegio que nos dira 
    si el estudiante aprobo o desaprobo
    datos:
    n=5
    nota 1 =6
    nota 2 =10
    nota 3=15
    nota 4=12
    nota 5=20
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("la cantidad de estudiantes es: ");
        int n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese la calificacion numero " + i + ": ");
            double nota = leer.nextDouble();
            
            if (nota >= 12) {
                System.out.println("Estudiante " + i + ": Aprobo");
            } else {
                System.out.println("Estudiante " + i + ": Reprobo");
            }
        }
    }
}

