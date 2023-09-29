/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner (System.in);
        System.out.println("Posa numero 1");
        n1=sc.nextInt ();
        
        System.out.println("Posa numero 2");
        n2=sc.nextInt ();
        
        System.out.println("Posa numero 3");
        n3=sc.nextInt ();
        
        if (n1>=n2 && n1>=n3){
            System.out.println(n1 + " Es el mes gran");
        }
        else if (n2>=n1 && n2>=n3) {
            System.out.println( n2 + " Es el mes gran");
        }
        else {
            System.out.println( n3 + " Es el mes gran");
        }
    }
}
