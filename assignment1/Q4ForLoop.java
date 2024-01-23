//Q4. Write a program to work with for loop (Printing a triangle of numbers).
import java.util.Scanner;
public class Q4ForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max limit: ");
        int max = scanner.nextInt();
        for (int i = 0; i < max; i++){
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
