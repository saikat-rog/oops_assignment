//Q3. Write a program to work with do while loop.

import java.util.Scanner;
public class Q3DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isCont;
        System.out.println("Enter below to add two numbers.");
        do {
            System.out.print("Enter num1: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter num2: ");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            System.out.println("To add again press 1 or to exit press 0");
            isCont = scanner.nextInt();
        }
        while (isCont == 1);
        System.out.println("You exited BITCH !!!");

    }
}

