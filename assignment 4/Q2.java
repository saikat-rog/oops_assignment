// Write a program to call the base class constructor from the derived class constructor using super keyword.

class BaseClass {
    int baseValue;

    BaseClass(int value) {
        this.baseValue = value;
        System.out.println("Base class constructor called with value: " + value);
    }
}

class DerivedClass extends BaseClass {
    int derivedValue;

    DerivedClass(int baseValue, int derivedValue) {
        super(baseValue); // Calling the base class constructor
        this.derivedValue = derivedValue;
        System.out.println("Derived class constructor called with derived value: " + derivedValue);
    }
}

public class Q2 {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass(10, 20);
    }
}
