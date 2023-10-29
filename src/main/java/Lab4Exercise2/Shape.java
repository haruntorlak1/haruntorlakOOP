package Lab4Exercise2;

public class Shape {
    private String color;
    private FillType.Type filled;

    public Shape(String color, FillType.Type filled) {
        this.color = color;
        this.filled = filled;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }

    public double getArea() {
        return 0.0; // Base class does not have a specific area
    }
}
