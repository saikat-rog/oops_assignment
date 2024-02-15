class MyClass {
    int defaultVar;
    public int publicVar;

    public MyClass(int defaultValue, int publicValue) {
        this.defaultVar = defaultValue;
        this.publicVar = publicValue;
    }
}

public class Q7 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass(5, 10);

        myObject.defaultVar = 15;

        // modifying public member variable
        myObject.publicVar = 20;

        System.out.println("Default Variable: " + myObject.defaultVar);
        System.out.println("Public Variable: " + myObject.publicVar);
    }
}
