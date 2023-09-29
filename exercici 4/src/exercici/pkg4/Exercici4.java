/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg4;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1,valor2;
        int suma,resta,multiplicacion;
        double division;
        System.out.print("Pon valor 1...");
        valor1=sc.nextInt();
        System.out.print("Pon valor 2...");
        valor2=sc.nextInt();

        suma = valor1+valor2;
        resta = valor1-valor2;
        multiplicacion = valor1 * valor2;
        System.out.println("La suma de " + valor1 + " + " + valor2 + " es " + suma);
        System.out.println("La resta de " + valor1 + " - " + valor2 + " es " + resta);
        System.out.println("La multiplicacion de " + valor1 + " * " + valor2 + " es " + multiplicacion);

        if(valor2 !=0)
        {//si esto es true

        division = (double)valor1 / valor2;
        System.out.println( valor1 + " / " + valor2 + " = " + division);
        }
        else {
        System.out.println("No puedo dividir por 0");
        }
    }
    
}
