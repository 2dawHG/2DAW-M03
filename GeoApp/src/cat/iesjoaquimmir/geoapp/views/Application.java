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
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
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

        System.out.printf("1-Quadrat%n2-Quadrat sobrecarregat%n3-Rectangle%n4-Rectangle sobrecarregat%n5-Cercle%n6-Crecle sobrecarregat%n7-Esfera%n8-Esfera sobrecarregada%n9-Colors%nEscull la opció: ");

        int num = input.nextInt();
        
            switch (num) {
                case 1:
                    square();
                    break;
                case 2:
                    squareSobrecarregat();
                    break;
                case 3:
                    rectangle();
                    break;
                case 4:
                    rectangleSobrecarregat();
                    break;
                case 5:
                    circle();
                    break;
                case 6:
                    circleSobrecarregat();
                    break;
                case 7:
                    sphere();
                    break;
                case 8:
                    sphereSobrecarregat();
                    break;
                case 9:
                    color();
                    break;
            }
    }
    
    private static void square() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Donem la mida del costat: ");
        double cost = input.nextDouble();
        
        Square c1 = new Square(cost);

        System.out.printf("Els costats del cuadrat: %.2f %n", c1.getSide());
        System.out.printf("L'àrea del cuadrat: %.2f %n", c1.getArea());
        System.out.printf("El perímetre del cuadrat: %.2f %n", c1.getPerimeter());
    }
    
    private static void squareSobrecarregat() {
         Square c2 = new Square();

        System.out.printf("Els costats del cuadrat: %.2f %n", c2.getSide());
        System.out.printf("L'àrea del cuadrat: %.2f %n", c2.getArea());
        System.out.printf("El perímetre del cuadrat: %.2f %n", c2.getPerimeter());
    }
    
    private static void rectangle() {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Donem la base: ");
        double base = input.nextDouble();
        
        System.out.printf("Donem l'altura: ");
        double altura = input.nextDouble();
        
        Rectangle r1 = new Rectangle(base, altura);

        System.out.printf("La base del rectangle: %.2f %n", r1.getBase());
        System.out.printf("L'altura del rectangle: %.2f %n", r1.getHeight());
        System.out.printf("L'àrea del rectangle: %.2f %n", r1.getArea());
        System.out.printf("El perímetre del rectangle: %.2f %n", r1.getPerimeter());
    }
    
    private static void rectangleSobrecarregat() {
        Rectangle r2 = new Rectangle();
        
        System.out.printf("La base del rectangle: %.2f %n", r2.getBase());
        System.out.printf("L'altura del rectangle: %.2f %n", r2.getHeight());
        System.out.printf("L'àrea del rectangle: %.2f %n", r2.getArea());
        System.out.printf("El perímetre del rectangle: %.2f %n", r2.getPerimeter());
    }
    
    private static void circle() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Donem el radi: ");
        double radi = input.nextDouble();
        
        Circle ci1 = new Circle(radi);

        System.out.printf("El radi del cercle: %.2f %n", ci1.getRadius());
        System.out.printf("L'àrea del cercle: %.2f %n", ci1.getArea());
        System.out.printf("El perímetre del cercle: %.2f %n", ci1.getPerimeter());
    }
    
    private static void circleSobrecarregat() {
        Circle ci2 = new Circle();
        
        System.out.printf("El radi del cercle: %.2f %n", ci2.getRadius());
        System.out.printf("L'àrea del cercle: %.2f %n", ci2.getArea());
        System.out.printf("El perímetre del cercle: %.2f %n", ci2.getPerimeter());
    }
    
    private static void sphere() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Donem el radi: ");
        double radi = input.nextDouble();
        
        Sphere s1 = new Sphere(radi);

        System.out.printf("El radi de l'esfera: %.2f %n", s1.getRadius());
        System.out.printf("L'àrea de l'esfera: %.2f %n", s1.getArea());
        System.out.printf("El volum de l'esfera: %.2f %n", s1.getVolume());
    }
    
    private static void sphereSobrecarregat() {
        Sphere s2 = new Sphere();
        
        System.out.printf("El radi de l'esfera: %.2f %n", s2.getRadius());
        System.out.printf("L'àrea de l'esfera: %.2f %n", s2.getArea());
        System.out.printf("El volum de l'esfera: %.2f %n", s2.getVolume());  
    }
    
    private static void color() {
        Scanner input = new Scanner(System.in);
        System.out.printf("1-RGB%n2-HEX TO RGB%n3-toHexString%n4-toRGBString%nEscull la opció: ");

        int opcio = input.nextInt();
        switch (opcio) { 
            case 1:
                Color co2 = new Color(125,125,Color.MAX_VALUE);
                System.out.printf("co1 -> r: %d g: %d b: %d %n", co2.getRed(), co2.getGreen(), co2.getBlue());
                System.out.printf("Colors creats: %d%n", Color.getCounter());
                break;
            case 2:
                Color co1 = Color.fromHexString("#A9F456");
                System.out.printf("co2 -> r: %d g: %d b: %d %n", co1.getRed(), co1.getGreen(), co1.getBlue());
                System.out.printf("Colors creats: %d%n", Color.getCounter());
                break;
            case 3:
                Color co3 = new Color(178,210,Color.MIN_VALUE);
                System.out.printf("co3 -> r: %d g: %d b: %d %n", co3.getRed(),co3.getGreen(),co3.getBlue());
                System.out.printf("co3 -> %s %n", co3.toHexString());
                System.out.printf("co3 -> %s %n", co3.toHexString(false));
                System.out.printf("Colors creats: %d%n", Color.getCounter());
                break;
            case 4:
                Color co4 = new Color(56,199,Color.MIN_VALUE);
                System.out.printf("co4 -> r: %d g: %d b: %d %n", co4.getRed(),co4.getGreen(),co4.getBlue());
                System.out.printf("co4 -> %s %n", co4.toRGBString());
                System.out.printf("co4 -> %s %n", co4.toRGBString(true));
                System.out.printf("Colors creats: %d%n", Color.getCounter());
                break;
        }
    }   
    
}