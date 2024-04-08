// Interface with variable declaration
interface MyInterface {
    int MAX_VALUE = 100; // Public, Static, and Final by default
}

// Main class to demonstrate usage
public class Q2 {
    public static void main(String[] args) {
        // Accessing the interface variable directly
        System.out.println("Interface variable MAX_VALUE: " + MyInterface.MAX_VALUE);
        
        // Modifying the interface variable will result in a compilation error
        // MyInterface.MAX_VALUE = 200; // Error: Cannot assign a value to final variable 'MAX_VALUE'
    }
}
