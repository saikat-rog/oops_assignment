class Parent {
    private int privateVar;
    
    public Parent(int value) {
        this.privateVar = value;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int value) {
        this.privateVar = value;
    }
}

class Child extends Parent {
    public Child(int value) {
        super(value);
    }

    public void displayPrivateVar() {
        System.out.println("Private Variable in Child: " + getPrivateVar());
    }
}

public class Q2 {
    public static void main(String[] args) {
        Child childObject = new Child(42);

        childObject.displayPrivateVar();
        childObject.setPrivateVar(20);
        childObject.displayPrivateVar();
    }
}
