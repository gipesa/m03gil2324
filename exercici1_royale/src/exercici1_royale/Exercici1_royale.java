/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1_royale;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici1_royale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Quantes copes has aconseguit? ");
        double copes;
        copes =sc.nextDouble();
        
        if (copes<=2000) {
            int carta;
            System.out.println("Quina carta vols? Mago electrico (0) o esbirro mega (1)? ");
            carta =sc.nextInt();
            if (carta == 0) {
            System.out.println("Has escollit  mago electrico ");
            }
            else if (carta == 1){
            System.out.println("Has escollit esbirro mega");
            }
            else {
            System.out.println("Opcio no valida");
            }
        }
    }    
}
