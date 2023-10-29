package Lab4Exercise2;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, FillType.Type filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + calculateCircumference(radius));
        System.out.println("Circumference (with constant PI): " + calculateCircumference(radius, Math.PI));
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double r) {
        return 2 * Math.PI * r;
    }

    public double calculateCircumference(double r, double PI) {
        return 2 * PI * r;
    }
}
