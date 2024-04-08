// Write a program to check how the constructor of the base class is called.

class BaseClass {
    BaseClass() {
        System.out.println("Constructor of BaseClass is called.");
    }
}

class DerivedClass extends BaseClass {
    DerivedClass() {
        System.out.println("Constructor of DerivedClass is called.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        DerivedClass derivedObject = new DerivedClass();
    }
}
