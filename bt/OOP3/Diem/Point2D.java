package OOP3.Diem;

public class Point2D implements Calculate {
    protected double x;
    protected double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void display() {
        System.out.println("Toa do diem: (" + this.x + ", " + this.y + ")");
    }

    public double distanceToOrigin() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distanceToPoint(Point2D point) {
        double dx = point.getX() - this.x;
        double dy = point.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point2D symmetricPoint() {
        return new Point2D(-x, -y);
    }
}

