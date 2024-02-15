class Coordinate {
    int x;
    int y;

    void displayCoordinates() {
        System.out.println("X: " + x + ", Y: " + y);
    }

    boolean isEqual(Coordinate other) {
        return this.x == other.x && this.y == other.y;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Coordinate point1 = new Coordinate();
        Coordinate point2 = new Coordinate();

        point1.x = 10;
        point1.y = 20;

        point2.x = 10;
        point2.y = 20;

        System.out.println("Coordinates of Point 1:");
        point1.displayCoordinates();

        System.out.println("Coordinates of Point 2:");
        point2.displayCoordinates();

        if (point1.isEqual(point2)) {
            System.out.println("The coordinates are equal.");
        } else {
            System.out.println("The coordinates are not equal.");
        }
    }
}
