package com.mycompany.oop_01;

import com.mycompany.oop_01.entities.Triangle;
import java.util.Scanner;

public class OOP_01 {

    public static void main(String[] args) {
        Scanner inputKeyboard = new Scanner(System.in);
        
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = inputKeyboard.nextDouble();
        x.b = inputKeyboard.nextDouble();
        x.c = inputKeyboard.nextDouble();
        
        System.out.println("Enter the measures of triangle Y:");
        y.a = inputKeyboard.nextDouble();
        y.b = inputKeyboard.nextDouble();
        y.c = inputKeyboard.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        
        inputKeyboard.close();
    }
}
