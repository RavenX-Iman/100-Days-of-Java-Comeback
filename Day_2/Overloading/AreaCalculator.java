package Day_2.Overloading;

public class AreaCalculator {
    // Overloaded methods
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Circle
    }
    public double calculateArea(double length, double width) {
        return length * width; // Rectangle
    }
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height; // Triangle
    }
    public double calculateArea(int side) {
        return side * side; // Square
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Circle area (r=5): " + calc.calculateArea(5.0));
        System.out.println("Rectangle area (l=4, w=6): " + calc.calculateArea(4.0, 6.0));
        System.out.println("Triangle area (b=4, h=5): " + calc.calculateArea(4.0, 5.0, true));
        System.out.println("Square area (side=5): " + calc.calculateArea(5));
    }
}
