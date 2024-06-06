package OOP3.Diem;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 4);
        p1.display();
        System.out.println("Khoang cach den goc toa do: " + p1.distanceToOrigin());
        Point2D p2 = new Point2D(6, 8);
        System.out.println("Khoang cach giua 2 diem: " + p1.distanceToPoint(p2));
        Point2D symmetricPoint2D = p1.symmetricPoint();
        symmetricPoint2D.display();

        Point3D point3D = new Point3D(1, 2, 3);
        point3D.display();
        System.out.println("Khoang cach den goc toa do: " + point3D.distanceToOrigin());
        Point3D point3D2 = new Point3D(4, 5, 6);
        System.out.println("Khoang cach giua 2 diem: " + point3D.distanceToPoint(point3D2));
        Point3D symmetricPoint3D = point3D.symmetricPoint();
        symmetricPoint3D.display();
    }
}