/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siwtch_dies_setmana;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Siwtch_dies_setmana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner sc = new Scanner (System.in);
        System.out.println("Posa un numero del 1 al 7");
        dia =sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Dilluns ");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
             case 4:
                System.out.println("Dijous");
                break;
             case 5:
                System.out.println("Divendres");
                break;
             case 6:
                System.out.println("Dissabte");
                break;
             case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("dia no valido");
                throw new AssertionError();
        }
    }
    
}
