package OOP3.Diem;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public void display() {
        System.out.println("Toa do diem: (" + super.x + ", " + super.y + ", " + this.z + ")");
    }

    @Override
    public double distanceToOrigin() {
        return Math.sqrt(super.x * super.x + super.y * super.y + this.z * this.z);
    }

    public double distanceToPoint(Point3D point) {
        double dx = point.getX() - super.x;
        double dy = point.getY() - super.y;
        double dz = point.getZ() - this.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public Point3D symmetricPoint() {
        return new Point3D(-x, -y, -z);
    }
}