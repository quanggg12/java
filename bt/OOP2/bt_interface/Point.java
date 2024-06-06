package OOP2.bt_interface;

public class Point implements Shape {
    private double x;
    private double y;

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double getDistance(Shape other) {
        double res = other.getDistance(other) - other.
        return res;         
    }

    
    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    
    public void rotate(double angle) {
        
    }


   
    public double getArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArea'");
    }


    
    public double getPerimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPerimeter'");
    }
}
