/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg11;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,n2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon valor 1");
        n1=sc.nextDouble();
        System.out.println("Pon valor 2");
         n2=sc.nextDouble();
         

         
         if (n1==n2){
             System.out.println("Son valores iguales");
         }
         else if (n1>n2){
            //System.out.println("Valor 1 es mas grande que valor 2");
             System.out.println(n1 + " superior a " + n2);
         }
         else {
             System.out.println(n2 +" Es superior a "+ n1);
         }
    }
    
}
