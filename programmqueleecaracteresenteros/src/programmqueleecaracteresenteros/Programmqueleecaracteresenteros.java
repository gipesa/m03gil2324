/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programmqueleecaracteresenteros;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Programmqueleecaracteresenteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TE VA A PEDIR A QUE CLASE VAS (A/B/C), UNA EDAD
        //A LA CLASE A VAN LOS ADULTOS I A LA B Y B LOS MENORES
        //EL PROGRAMA TIENE QUE VER QUE ESTAS EN LA CLASE CORRECTA
        int edad;
        char clase; //caracter
        Scanner sc = new Scanner (System.in);
        System.out.println("A que clase vas?");
        clase=sc.next().charAt(0);
        System.out.println(" Vas al grupo " + clase);
        System.out.println(" Que edad tienes ");
        edad=sc.nextInt ();
        System.out.println(" tienes " + edad + "anos");
        
        if (clase=='A' && edad>=18) {
        System.out.println("Vas a la clase correcte " + clase);   
        }
        else if (clase=='B' && edad<18) {
        System.out.println(" Vas a la clase correcte " + clase);
        }
        else if (clase=='C' && edad<18) {
        System.out.println(" Vas a la clase correcte " + clase);
        }
        else {
        System.out.println("Per les teves dades i edad no hauries d'anar a la clase");
        }
    }
    
}
