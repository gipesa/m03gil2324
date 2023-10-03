/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18_uds2;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Exercici18_uds2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double t_normal,h_normal,horas,salario_extra,salario,salario_normal,h_extra;
        System.out.println("Quantes hores has treballat?");
        t_normal = 20;
        h_normal= 35;
        salario_extra=1.5;
        horas=sc.nextDouble();
        
        if (horas>h_normal) {
            h_extra = horas - h_normal;
            salario_extra = h_extra*t_normal*salario_extra;
            salario_normal = h_normal * t_normal;
            salario = salario_extra + salario_normal;
            System.out.println("El teu salari es " + salario);
            
        }
        else {
            salario = horas*t_normal;
            System.out.println("El teu salari es " + salario);
        }
    }
    
}
