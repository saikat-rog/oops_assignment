// Base interface
interface Shape {
    void draw();
}

// Extended interface
interface ColoredShape extends Shape {
    void setColor(String color);
}

// Class implementing the extended interface
class Rectangle implements ColoredShape {
    private String color;

    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printColor() {
        System.out.println("Color of the rectangle: " + color);
    }
}

// Main class to demonstrate usage
public class Q3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.setColor("Blue");
        rectangle.printColor();
    }
}
