package OOP2.bt_interface;

public interface Shape {
    double getArea();
    double getPerimeter();
    double getDistance(Shape other);
    void translate(double dx, double dy);
    void rotate(double angle);
}




