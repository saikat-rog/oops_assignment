public class Q4 {
    public static void main(String[] args) {
        // Integer literals
        int intValue1 = 42;
        int intValue2 = 20;

        int sum = intValue1 + intValue2;
        System.out.println("Sum: " + sum);

        int difference = intValue1 - intValue2;
        System.out.println("Difference: " + difference);

        int product = intValue1 * intValue2;
        System.out.println("Product: " + product);

        double quotient = (double) intValue1 / intValue2;
        System.out.println("Quotient: " + quotient);

        // bolean literals
        boolean boolValue1 = true;
        boolean boolValue2 = false;

        boolean andResult = boolValue1 && boolValue2;
        System.out.println("Logical AND Result: " + andResult);

        boolean orResult = boolValue1 || boolValue2;
        System.out.println("Logical OR Result: " + orResult);
    }
}
