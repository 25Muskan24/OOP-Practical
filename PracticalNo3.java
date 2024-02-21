
/* Aim:- Practical No 3
Author:- Muskan Choudhary
Version:- 3.0
Date:- 12 feb 2024
*/
import java.util.Scanner;

class VolumeCalculator {
    // Method to calculate volume of a cube
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // Method to calculate volume of a cylinder
    public double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Method to calculate volume of a box
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator volumeCalculator = new VolumeCalculator();

        System.out.println("Enter the dimensions for the cube (side length):");
        double cubeSide = scanner.nextDouble();

        System.out.println("Enter the dimensions for the cylinder (radius and height):");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();

        System.out.println("Enter the dimensions for the box (length, width, and height):");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();

        // Calculate volumes using method overloading
        double cubeVolume = volumeCalculator.calculateVolume(cubeSide);
        double cylinderVolume = volumeCalculator.calculateVolume(cylinderRadius, cylinderHeight);
        double boxVolume = volumeCalculator.calculateVolume(boxLength, boxWidth, boxHeight);

        // Output results
        System.out.println("Volume of the cube: " + cubeVolume);
        System.out.println("Volume of the cylinder: " + cylinderVolume);
        System.out.println("Volume of the box: " + boxVolume);
    }
}
