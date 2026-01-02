public class Circle {

    private double radius;

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate Area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate Perimeter
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);

        System.out.println("Radius     : " + c.getRadius());
        System.out.println("Area       : " + c.calculateArea());
        System.out.println("Perimeter  : " + c.calculatePerimeter());
    }
}