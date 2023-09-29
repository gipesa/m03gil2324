/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici12;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon valor ");
        num1=sc.nextInt ();
        if (num1>=0){
            System.out.println("Es positiu ");
        }
        else {
            System.out.println("Es negatiu");
        }
    }
    
}
