package org.launchcode.java.studios;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        if (!input.hasNextDouble()){
            System.out.println("Must be a valid number.");
            return;
        }

        Double r = input.nextDouble();
        Double a = Circle.getArea(r);
        System.out.println("Area = " + a );



    }
}
