//Q2. Write a program to work with while loop.

import java.util.Scanner;
public class Q2WhileLoop {
    public static void main(String[] args) {
        System.out.print("Enter 1 to continue and 0 to stop: ");
        Scanner scanner = new Scanner(System.in);
        int loopStatus = scanner.nextInt();
        int count = 0;
        while (loopStatus == 1){
            count++;
            System.out.println("Loop continued " + count + " times");
            System.out.print("Enter 1 to continue and 0 to stop: ");
            loopStatus = scanner.nextInt();
        }
        System.out.print("Shit!! man, you stopped the loop, hope to see you next time. Loop iterated " + count + " times");
    }
}
