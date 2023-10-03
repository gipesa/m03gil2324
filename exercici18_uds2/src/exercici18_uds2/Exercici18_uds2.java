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
        final int SALARIO_SIN_IMPUESTOS=500,SALARIO_TOPE_IMPUESTOS = 0;
        double impuestos=0,salario_neto,salario_impuestos,salario_tope_impuestos;
        double impuestos_25 = 0;
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
        if(salario>SALARIO_SIN_IMPUESTOS){
           salario_impuestos = salario - SALARIO_SIN_IMPUESTOS;
           //System.out.println("Salari a aplicar impuestos " + salario_impuestos);
           impuestos= (salario_impuestos * 25)/100;
            System.out.println("impuestos " + impuestos);
        }
        else if (salario>SALARIO_TOPE_IMPUESTOS){
            salario_tope_impuestos = salario - SALARIO_TOPE_IMPUESTOS;
            impuestos = salario_tope_impuestos * 0.45;
            salario_impuestos = SALARIO_TOPE_IMPUESTOS - SALARIO_SIN_IMPUESTOS;
            impuestos_25= impuestos + impuestos_25;
        }
        else{
            impuestos=0;
        }
        salario_neto= salario - impuestos;
        System.out.println("El teu salari es " + salario_neto);
    }
    
}
