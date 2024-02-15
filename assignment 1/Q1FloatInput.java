//Q1. Write a program to work with float input (predefined)

import java.util.Scanner;
public class Q1FloatInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float floatInput = scanner.nextFloat();

        System.out.println("The number you entered is: " + floatInput);
    }
}