package OOP2.bt_interface;

public class Circle implements Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    
    public double getDistance(Shape other) {
       
    }

    
    public void translate(double dx, double dy) {
        center.translate(dx, dy);
    }

    
    public void rotate(double angle) {
        
    }
}