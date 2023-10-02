/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5_royale;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici5_royale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantes copes has aconseguit? ");
        
        double copes;
        copes=sc.nextDouble();
        
        if (copes >=0 && copes<=1999) {
            System.out.println("Quina carta esculls? Mago electrico (0) o Esbirro mega (1)?");
            int carta;
            carta =sc.nextInt();
            if (carta == 0) {
            System.out.println("Has escollit  mago electrico ");
            }
            else if (carta == 1){
            System.out.println("Has escollit esbirro mega");
            }
            else {
            System.out.println("Opcion no valida");
            }
        }
         else if (copes >=1000 && copes<=2999) {
            System.out.println("Quina carta vols, Caballero (2) o Bandida (3)");
            int carta=sc.nextInt();
            if ( carta == 2) {
            System.out.println("Has escollit Caballero ");
            }
            else if (carta == 3){
            System.out.println("Has escollit Bandida");
            }
            else {
            System.out.println("Opcion no valida");
            }
        }
         else if (copes>=3000) {
            System.out.println("Quina carta vols, ejercito de esqueletos (4) o Gigantes (5)? ");
            int carta=sc.nextInt();
            if ( carta == 4) {
            System.out.println("Has escollit ejercito de esqueletos ");
            }
            else if (carta == 5){
            System.out.println("Has escollit ejercito de gigantes");
            }
            else  {
            System.out.println("Opcion no valida");
            }
        }

    }
    
}
