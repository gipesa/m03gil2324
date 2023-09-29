/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filesprogramvariables;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class FilesProgramVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int edad;
        edad = 20;
        System.out.println("Tu edad es " + edad);
        */
        Scanner pantalla = new Scanner( System.in);
        System.out.println("Que nota crees que sacaras en M01?");
        int nota1;
        nota1 = pantalla.nextInt();
        nota1 = 6;
        System.out.println("Tu nota de M01 es " + nota1);
        System.out.println("Que nota crees que sacaras en M02?");
        int nota2;
        nota2 = pantalla.nextInt();
        nota2 = 7;
        System.out.println("Tu nota de M02 es " + nota2);
        int nota3;
        System.out.println("Que nota crees que sacaras en M03?");
        nota3 = pantalla.nextInt();
        nota3 = 5;
        System.out.println("Tu nota de M03 es " + nota3);
        
    }
    
}
