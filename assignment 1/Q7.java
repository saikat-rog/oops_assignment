import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scanner.nextLine();
//        String str = "Hello, World!";

        // 1. length() method
        int length = str.length();
        System.out.println("1. Length of the string: " + length);

        // 2. charAt() method
        char firstChar = str.charAt(0);
        System.out.println("2. First character of the string: " + firstChar);

        // 3. substring() method
        String substring = str.substring(7);
        System.out.println("3. Substring from index 7: " + substring);

        // 4. indexOf() method
        int indexOfComma = str.indexOf(",");
        System.out.println("4. Index of ',' in the string: " + indexOfComma);

        // 5. toUpperCase() method
        String upperCaseString = str.toUpperCase();
        System.out.println("5. Uppercase version of the string: " + upperCaseString);

        // 6. toLowerCase() method
        String lowerCaseString = str.toLowerCase();
        System.out.println("6. Lowercase version of the string: " + lowerCaseString);

        // 7. contains() method
        boolean containsWord = str.contains("World");
        System.out.println("7. Does the string contain 'World'? " + containsWord);

        // 8. replace() method
        String replacedString = str.replace("Hello", "Hi");
        System.out.println("8. String after replacement: " + replacedString);

        // 9. trim() method
        String stringWithSpaces = "   Trim me!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("9. String after trimming spaces: '" + trimmedString + "'");
    }
}
