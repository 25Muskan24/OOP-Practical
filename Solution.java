public class Solution {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            System.out.println(divide(x, y));
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        validate(20); // Example usage of validate() method
    }

    public static int divide(int x, int y) throws Exception {
        if (y == 0) {
            throw new Exception("Cannot divide by zero.");
        }
        return x / y;
    }

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above.");
        } else {
            System.out.println("Welcome to vote.");
        }
    }

}
