public class Circle {
    private int x, y, r;
    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getR() {
        return r;
    }
    public double chu_vi() {
        return 2 * Math.PI * getR();
    }

    public double dien_tich() {
        return getR() * getR() * Math.PI;
    }
    public void xuat() {
        System.out.println("x = " + x +", y = " + y + ", r = " + r);
        System.out.printf("Chu vi %.4f\n", chu_vi());
        System.out.printf("Dien tich %.4f\n", dien_tich());
    }

    public static void main(String[] args) {
        Circle hi = new Circle(1, 2, 3);
        hi.xuat();
    }

}
