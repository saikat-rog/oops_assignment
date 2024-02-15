import java.util.*;
class Q1{
    public static void printArmstrong(int start, int end){
        System.out.println("Armstrong nums between " +  start + " and " + end + ": " );
        for (int i = start; i<=end; i++) {
            int digits = 0, temp = i, temp2 = i;
            while (temp!=0) {
                temp = temp/10;
                digits++;
            }
            double s = 0;
            while (temp2 != 0) {
                s = s + Math.pow(temp2 % 10, digits);
                temp2 = temp2/10;
            }
            if (s == i) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range: ");
        int start = sc.nextInt();
        System.out.println("Enter end range: ");
        int end = sc.nextInt();
        printArmstrong(start, end);
    }
}