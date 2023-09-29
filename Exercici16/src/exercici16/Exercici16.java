/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici16;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double nota;
       Scanner sc = new Scanner (System.in);
       System.out.println("Que nota has sacado?");
       nota=sc.nextInt ();
       
       if (nota>=0 && nota<3) {
        System.out.println("Molt deficient");
       }
       else if (nota<=3 && nota<5) {
       System.out.println("Insuficient");   
       }
       else if (nota>=5 && nota<6) {
        System.out.println("Bien");
       }
       else if (nota>=6 && nota<9) {
        System.out.println("Notable");
       }
       else if (nota>=9 && nota<=10) {
       System.out.println("Excelente");
       }
       
    }
    
}
