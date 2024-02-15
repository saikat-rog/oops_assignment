class Student {
    String name;
    int roll;
    double marks;

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Saikat Das";
        student1.roll = 44;
        student1.marks = 69.69;

        // Displaying student details
        student1.displayStudentDetails();
    }
}
