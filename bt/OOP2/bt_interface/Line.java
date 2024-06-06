package OOP2.bt_interface;

public class Line implements Shape {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    
    public double getArea() {
        return 0;
    }

    
    public double getPerimeter() {
        return start.getDistance(end);
    }

    
    public double getDistance(Shape other) {
                
    }

    
    public void translate(double dx, double dy) {
        start.translate(dx, dy);
        end.translate(dx, dy);
    }

    
    public void rotate(double angle) {
        
    }
}