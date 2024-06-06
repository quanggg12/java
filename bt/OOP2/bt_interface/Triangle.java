package OOP2.bt_interface;

public class Triangle implements Shape {
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    
    public double getArea() {
        double side1 = vertex1.getDistance(vertex2);
        double side2 = vertex2.getDistance(vertex3);
        double side3 = vertex3.getDistance(vertex1);
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    
    public double getPerimeter() {
        double side1 = vertex1.getDistance(vertex2);
        double side2 = vertex2.getDistance(vertex3);
        double side3 = vertex3.getDistance(vertex1);
        return side1 + side2 + side3;
    }

    
    public double getDistance(Shape other) {
        double res = 
        return res;
    }

    
    public void translate(double dx, double dy) {
        vertex1.translate(dx, dy);
        vertex2.translate(dx, dy);
        vertex3.translate(dx, dy);
    }

    
    public void rotate(double angle) {
        
    }
}
