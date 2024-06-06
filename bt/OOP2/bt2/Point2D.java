public class Point2D {
    private double x, y;
    // private double root_x = 0, root_y = 0;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void show() {
        System.out.println("Point 2D" + "(" + this.x + ", " + this.y + ")");
    }

    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }


    public double distance(double x, double y) {
        double dx = (this.getX() - x);
        double dy = (this.getY() - y);
        return Math.sqrt(dx * dx + dy * dy);
    }
}
