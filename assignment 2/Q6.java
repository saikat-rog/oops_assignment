// 6) Write a program to show call by reference using member variables of an object.

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void displayCoordinates() {
        System.out.println("X: " + x + ", Y: " + y);
    }
}

public class Q6 {
    static void modifyCoordinates(Point p) {
        p.x = 20;
        p.y = 30;
    }

    public static void main(String[] args) {
        Point point = new Point(5, 10);

        System.out.println("Before modification:");
        point.displayCoordinates();

        modifyCoordinates(point);

        System.out.println("After modification:");
        point.displayCoordinates();
    }
}
