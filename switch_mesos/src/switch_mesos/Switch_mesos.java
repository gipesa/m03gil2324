/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_mesos;

import java.util.Scanner;

/**
 *
 * @author gipe3503
 */
public class Switch_mesos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Posa una lletra g,f,m,a");
        char mesos = sc.next().charAt(0);
        switch (mesos) {
            case 'g':
                System.out.println("Gener ");
                break;
            case 'f':
                System.out.println("Febrer");
                break;
            case 'm':
                System.out.println("Marc");
                break;
             case 'a':
                System.out.println("Abril");
                break;
            default:
                System.out.println("Mes no valid");
                throw new AssertionError();
        }
    }
    
}
