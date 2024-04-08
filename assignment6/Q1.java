// Class with different access specifiers
class AccessSpecifierExample {
    public int publicMember = 10;
    protected int protectedMember = 20;
    int defaultMember = 30;
    private int privateMember = 40;

    // Method to display member values
    public void display() {
        System.out.println("Public member: " + publicMember);
        System.out.println("Protected member: " + protectedMember);
        System.out.println("Default member: " + defaultMember);
        System.out.println("Private member: " + privateMember);
    }
}

// Main class to demonstrate access
public class Q1 {
    public static void main(String[] args) {
        AccessSpecifierExample obj = new AccessSpecifierExample();
        
        // Accessing members of AccessSpecifierExample class
        System.out.println("Accessing members from the same package:");
        System.out.println("Public member: " + obj.publicMember);
        System.out.println("Protected member: " + obj.protectedMember);
        System.out.println("Default member: " + obj.defaultMember);
        // Private member cannot be accessed directly from another class
        
        // Accessing member using method
        obj.display();
    }
}
