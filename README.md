# RandomNumber
random number between 1 and 6 with java

This file will execute two sets of code: 
1. it will calculate the volume of a cylinder
2. Give you a random Number between 1-6 

To change this code to be user friendly (so you can type in your own value), change these few lines of code: 

import java.util.Scanner;

public class BuiltInMethods{
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        double centimeterLength;
        /* 
            Calculate The volume of a Cylinder 
            Radius squared times PI times height
        */
        System.out.print("Enter radius of the cylinder: ");
        double radius = keyBoard.nextDouble(); // units centimeters 
        System.out.print("Enter the height of the cylinder: ");
        double height = keyBoard.nextDouble(); // units centimeters 

        double volume = Math.pow(radius, 2) * Math.PI * height;

        /* 
            Calculate a random number between 1 and 6 
        */
        double randomNumber = Math.floor((Math.random() * 6) + 1);
        System.out.println( "The volume of the cylinder is " + volume + " cubic centimeters" + " And a Random number between 1 and 6 is: " + randomNumber);

        System.exit(0);
    }
}
        
