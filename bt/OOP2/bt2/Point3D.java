import java.util.ArrayList;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

    public void show() {
        System.out.println("Point 3D (" + super.getX() + ", " + super.getY() + ", " + this.z + ")");
    }

    public double distance() {
        // return Math.sqrt(super.getX() * super.getX() + super.getY() * super.getY() + this.z * this.z);
        return Math.sqrt(super.distance() * super.distance() + this.z * this.z);
    }

    public static void main(String[] args) {
        // List<Point3D> list = new ArrayList<Point3D>();
        Point3D test = new Point3D(3, 4, 5);
        test.show();
        double res = test.distance();
        System.out.println(res);
    }
}
