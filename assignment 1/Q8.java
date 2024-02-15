//Q8. Write a program to sort a String Array.
import java.util.Arrays;
import java.util.Scanner;

 public class Q8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strArray = new String[5];
        System.out.println("Enter five words and try to sort them: ");
        for (int i = 0; i < 5; i++){
            strArray[i] = scanner.nextLine();
        }
        Arrays.sort(strArray);
        System.out.println("The string array after sort is: ");
        for (int i = 0; i < 5; i++){
            System.out.println(strArray[i] + " ");
        }
    }
}
