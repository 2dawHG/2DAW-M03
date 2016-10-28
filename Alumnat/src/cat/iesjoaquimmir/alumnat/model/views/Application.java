/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.alumnat.model.views;

import cat.iesjoaquimmir.alumnat.model.businesslayer.entities.Alumne;
import java.util.Scanner;

/**
 *
 * @author HG
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.printf("1-Nothing%n2-Nom%n3-Nom+DNI%n4-Tot%nEscull opció: ");
        
        int num = input.nextInt();
        
        switch (num) {
            case 1:
                alumneDefault();
                    break;
            case 2:
                alumneNom();
                    break;
            case 3:
                alumneNomDni();
                break;
            case 4:
                alumneAll();
                break;
        }
    }
    
    private static void alumneDefault() {
        Alumne a1 = new Alumne();
        System.out.printf("%s %n",a1.getSalutacio());
    }
        
    private static void alumneNom() {
        Scanner input = new Scanner(System.in);

        System.out.printf("Com et dius? ");
        String nom = input.next();

        Alumne a2 = new Alumne(nom);
        System.out.printf("%s %n",a2.getSalutacio());
    }
        
    private static void alumneNomDni() {
        Scanner input = new Scanner(System.in);

        System.out.printf("Com et dius? ");
        String nom = input.next();
        System.out.printf("Número de DNI? ");
        String dni = input.next();

        Alumne a3 = new Alumne(nom, dni);
        System.out.printf("%s %n",a3.getSalutacio());
    }
        
    private static void alumneAll() {
        Scanner input = new Scanner(System.in);

        System.out.printf("Com et dius? ");
        String nom = input.next();
        System.out.printf("Número de DNI? ");
        String dni = input.next();
        System.out.printf("Quina edat tens? ");
        int edat = input.nextInt();

        Alumne a4 = new Alumne(nom, dni, edat);
        System.out.printf("%s %n",a4.getSalutacio());
    }
}