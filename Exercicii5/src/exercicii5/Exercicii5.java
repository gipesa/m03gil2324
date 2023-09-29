/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicii5;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercicii5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                double radio,diametro,longitud,area;
        double pi=3.14;
        Scanner sc = new Scanner(System.in);

        System.out.println("Pon el radio de la circumferencia");
        radio = sc.nextDouble();
        diametro = radio*2;
        longitud = pi * diametro;

        System.out.println("La longitud de la circunferencia de radio " + radio +
        " es " + longitud);
        area = pi * radio *radio;

        System.out.println("La area de la circunferencia de radio " + radio + " es " + area);
    }
    
}
