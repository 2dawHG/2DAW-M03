/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Rectangle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Circle;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Sphere;
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

        System.out.printf("1-Quadrat%n2-Rectangle%n3-Cercle%n4-Esfera %nEscull la figura que vulguis: ");

        int num = input.nextInt();
       
        switch (num) {
            case 1:
                square();
                break;
            case 2:
                rectangle();
                break;
            case 3:
                circle();
                break;
            case 4:
                sphere();
                break;
        }
    }
    
    private static void square() {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Donem la mida del costat: ");
        double cost = input.nextDouble();
        
        Square c1 = new Square(cost);
        //c1.setSide(cost);
        System.out.printf("Els costats del cuadrat: %.2f %n", c1.getSide());
        System.out.printf("L'àrea del cuadrat: %.2f %n", c1.getArea());
        System.out.printf("El perímetre del cuadrat: %.2f %n", c1.getPerimeter());
    }
    
    private static void rectangle() {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Donem la base: ");
        double base = input.nextDouble();
        
        System.out.printf("Donem l'altura: ");
        double altura = input.nextDouble();
        
        Rectangle r1 = new Rectangle(base, altura);
        //r1.setBase(base);
        //r1.setHeight(altura);
        System.out.printf("La base del rectangle: %.2f %n", r1.getBase());
        System.out.printf("L'altura del rectangle: %.2f %n", r1.getHeight());
        System.out.printf("L'àrea del rectangle: %.2f %n", r1.getArea());
        System.out.printf("El perímetre del rectangle: %.2f %n", r1.getPerimeter());
    }
    
    private static void circle() {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Donem el radi: ");
        double radi = input.nextDouble();
        
        Circle ci1 = new Circle(radi);
        //ci1.setRadius(radi);
        System.out.printf("El radi del cercle: %.2f %n", ci1.getRadius());
        System.out.printf("L'àrea del cercle: %.2f %n", ci1.getArea());
        System.out.printf("El perímetre del cercle: %.2f %n", ci1.getPerimeter());
    }
    
    private static void sphere() {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Donem el radi: ");
        double radi = input.nextDouble();
        
        Sphere s1 = new Sphere(radi);
        //s1.setRadius(radi);
        System.out.printf("El radi de l'esfera: %.2f %n", s1.getRadius());
        System.out.printf("L'àrea de l'esfera: %.2f %n", s1.getArea());
        System.out.printf("El volum de l'esfera: %.2f %n", s1.getVolume());
    }
    
}
