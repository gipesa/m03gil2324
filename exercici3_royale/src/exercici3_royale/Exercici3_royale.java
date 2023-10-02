/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3_royale;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici3_royale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantes copes has aconseguit? ");        
        double copes;
        copes=sc.nextDouble();
        
        if (copes<=2000) {
            System.out.println("Quina carta esculls? Mago electrico (m) o Esbirro mega (e)?");
            char letras = sc.next().charAt(0);
            if (letras == 'm' || letras == 'M') {
            System.out.println("Has escollit  mago electrico ");
            }
            else if (letras == 'e' || letras == 'E'){
            System.out.println("Has escollit esbirro mega");
            }
            else {
            System.out.println("Opcion no valida");
            }
        }
        else if (copes>=2000) {
            System.out.println("Quina carta vols, Caballero (c) o Bandida (b)");
            char letras = sc.next().charAt(0);
            if ( letras == 'c'|| letras == 'C') {
            System.out.println("Has escollit Caballero ");
            }
            else if (letras == 'b'|| letras == 'B'){
            System.out.println("Has escollit Bandida");
            }
            else {
            System.out.println("Opcion no valida");
            }
        }
        else {
            System.out.println("Opcio no valida");
        }

    }
    
}
