/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v1,v2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Pon valor 1" );
        v1=sc.nextDouble ();
        System.out.println("Pon valor 2");
        v2=sc.nextDouble();
        
        if (v1>v2){
            System.out.println(v1 +" Es major que "+ v2);
        }
        else {
            System.out.println(v2 +" Es major que "+ v1);
        }
    }
    
}
