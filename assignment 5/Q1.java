// Write a program to work with multiple catch block.

public class Q1 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Trying to access an element outside the array bounds
            int result = 10 / 0; // Trying to divide by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes, regardless of exceptions.");
        }
    }
}
