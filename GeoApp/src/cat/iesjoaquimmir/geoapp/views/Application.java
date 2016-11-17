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
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.AlphaColor;
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

        System.out.printf("1-Cuadrat%n2-Rectangle%n3-Cercle%n4-Esfera%n5-Color%nEscull la opció: ");
        int num = input.nextInt();
        
        switch (num) {
            case 1:
                square();
                break;
           /* case 2:
                rectangle();
                break;
            case 3:
                circle();
                break;
            case 4:
                sphere();
                break;
            case 5:
                color();
                break;*/
        }
    }
    
    private static void square() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Donem la mida del costat: ");
        double cost = input.nextDouble();
        System.out.printf("Donem la opacitat de la linia: ");
        double op1 = input.nextDouble();
        System.out.printf("Donem el color de linia RED: ");
        int red = input.nextInt();
        System.out.printf("Donem el color de linia GREEN: ");
        int green = input.nextInt();
        System.out.printf("Donem el color de linia BLUE: ");
        int blue = input.nextInt();
        System.out.printf("Donem la opacitat de fons: ");
        double op2 = input.nextDouble();
        System.out.printf("Donem el color de fons RED: ");
        int red2 = input.nextInt();
        System.out.printf("Donem el color de fons GREEN: ");
        int green2 = input.nextInt();
        System.out.printf("Donem el color de fons BLUE: ");
        int blue2 = input.nextInt();
        
        AlphaColor co1 = new AlphaColor(op1, red, green, blue);
        AlphaColor co2 = new AlphaColor(op2, red2, green2, blue2);
        Square c1 = new Square(cost, co1, co2);

        System.out.printf("%s", c1.toString());
       // System.out.printf("%s %n", co1.toString());
       // System.out.printf("%s %n", co2.toString());
        
    }
    
   /* private static void rectangle() {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Donem la base: ");
        double base = input.nextDouble();
        
        System.out.printf("Donem l'altura: ");
        double altura = input.nextDouble();
        
        int red = input.nextInt();
        System.out.printf("Donem el color de linia GREEN: ");
        int green = input.nextInt();
        System.out.printf("Donem el color de linia BLUE: ");
        int blue = input.nextInt();
        System.out.printf("Donem el color de fons RED: ");
        int red2 = input.nextInt();
        System.out.printf("Donem el color de fons GREEN: ");
        int green2 = input.nextInt();
        System.out.printf("Donem el color de fons BLUE: ");
        int blue2 = input.nextInt();
        
        Color co1 = new AlphaColor(red, green, blue);
        Color co2 = new Color(red2, green2, blue2);
        Rectangle r1 = new Rectangle(base, altura, co1, co2);

        System.out.printf("La base del rectangle: %.2f %n", r1.getBase());
        System.out.printf("L'altura del rectangle: %.2f %n", r1.getHeight());
        System.out.printf("L'àrea del rectangle: %.2f %n", r1.getArea());
        System.out.printf("El perímetre del rectangle: %.2f %n", r1.getPerimeter());
        System.out.printf("El color de linia es : %s %n", r1.getForegroundColor().toHexString());
        System.out.printf("El color de fons es : %s %n", r1.getBackgroundColor().toHexString());
    }
    
    private static void circle() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Donem el radi: ");
        double radi = input.nextDouble();
        
        int red = input.nextInt();
        System.out.printf("Donem el color de linia GREEN: ");
        int green = input.nextInt();
        System.out.printf("Donem el color de linia BLUE: ");
        int blue = input.nextInt();
        System.out.printf("Donem el color de fons RED: ");
        int red2 = input.nextInt();
        System.out.printf("Donem el color de fons GREEN: ");
        int green2 = input.nextInt();
        System.out.printf("Donem el color de fons BLUE: ");
        int blue2 = input.nextInt();
        
        Color co1 = new Color(red, green, blue);
        Color co2 = new Color(red2, green2, blue2);
        Circle ci1 = new Circle(radi, co1, co2);

        System.out.printf("El radi del cercle: %.2f %n", ci1.getRadius());
        System.out.printf("L'àrea del cercle: %.2f %n", ci1.getArea());
        System.out.printf("El perímetre del cercle: %.2f %n", ci1.getPerimeter());
        System.out.printf("El color de linia es : %s %n", ci1.getForegroundColor().toHexString());
        System.out.printf("El color de fons es : %s %n", ci1.getBackgroundColor().toHexString());
    }
    
    private static void sphere() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Donem el radi: ");
        double radi = input.nextDouble();
        
        int red = input.nextInt();
        System.out.printf("Donem el color de linia GREEN: ");
        int green = input.nextInt();
        System.out.printf("Donem el color de linia BLUE: ");
        int blue = input.nextInt();
        System.out.printf("Donem el color de fons RED: ");
        int red2 = input.nextInt();
        System.out.printf("Donem el color de fons GREEN: ");
        int green2 = input.nextInt();
        System.out.printf("Donem el color de fons BLUE: ");
        int blue2 = input.nextInt();
        
        Color co1 = new Color(red, green, blue);
        Color co2 = new Color(red2, green2, blue2);
        Sphere s1 = new Sphere(radi, co1, co2);

        System.out.printf("El radi de l'esfera: %.2f %n", s1.getRadius());
        System.out.printf("L'àrea de l'esfera: %.2f %n", s1.getArea());
        System.out.printf("El volum de l'esfera: %.2f %n", s1.getVolume());
        System.out.printf("El color de linia es : %s %n", s1.getForegroundColor().toHexString());
        System.out.printf("El color de fons es : %s %n", s1.getBackgroundColor().toHexString());
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
    }   */
    
}