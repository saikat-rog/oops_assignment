// Write a program to work with user defined exceptions.

// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Class to demonstrate user-defined exception
class Q3 {
    // Method that throws the custom exception
    static void checkAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            // Testing the checkAge method with different ages
            checkAge(20); // Valid age
            checkAge(-5); // Throws CustomException
        } catch (CustomException e) {
            // Catching and handling the custom exception
            System.out.println("Custom exception occurred: " + e.getMessage());
        }
    }
}
