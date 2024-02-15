
class Animal {
    void eat() {
        System.out.println("This animal eats.");
    }
}

class Mammal extends Animal {
    void run() {
        System.out.println("This mammal runs.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();
        myDog.run();
        myDog.bark();
    }
}
