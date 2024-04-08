// Write a program to work with different built in exceptions.

public class Q2 {
    public static void main(String[] args) {
        try {
            // ArithmeticException: Trying to divide by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        }

        try {
            // ArrayIndexOutOfBoundsException: Trying to access an element outside the array bounds
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred: " + e.getMessage());
        }

        try {
            // NullPointerException: Trying to access a method or property of a null object
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred: " + e.getMessage());
        }

        try {
            // NumberFormatException: Trying to parse a string that is not a valid number
            String strNumber = "abc";
            int number = Integer.parseInt(strNumber);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred: " + e.getMessage());
        }

        try {
            // IllegalArgumentException: Passing illegal argument to a method
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument exception occurred: " + e.getMessage());
        }

        try {
            // ClassNotFoundException: Trying to load a class which doesn't exist
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exception occurred: " + e.getMessage());
        }
    }
}
