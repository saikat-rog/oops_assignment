import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
// Declare and initialize a 3D array of integers
        Scanner sc = new Scanner(System.in);
        int[][][] threeDArray = {
                {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
                {{13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24}}
        };
        
        System.out.println(threeDArray[1][2][0]);
    }
}