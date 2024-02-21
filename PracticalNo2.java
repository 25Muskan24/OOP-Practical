
/* Aim:- Practical No 2
Author:- Muskan Choudhary
Version:- 2.0
Date:- 6 feb 2024

*/
import java.util.Scanner;

public class PracticalNo2 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");

        // Read the radius from user input
        double radius = scanner.nextDouble();

        // Check if the radius is zero or less than zero
        if (radius <= 0) {
            System.out.println("Please enter a non-zero positive number for the radius.");
        } else {
            // Calculate and display the perimeter and area
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);

            System.out.println("Perimeter of the circle: " + perimeter);
            System.out.println("Area of the circle: " + area);
        }

        // Close the Scanner
        scanner.close();
    }
}
