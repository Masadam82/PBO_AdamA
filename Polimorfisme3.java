class Shape {
    public double hitungLuas() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Luas lingkaran: " + c.hitungLuas()); // Output: Luas lingkaran: 78.54
    }
}
