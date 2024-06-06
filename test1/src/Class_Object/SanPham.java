//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class SanPham {
    private String tenSp;
    private double donGia, giamGia;
    public double getThueNK() {
        return 0.1 * donGia;
    }
    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.print("Nhap ten sp: "); this.tenSp = sc.nextLine();
        System.out.print("Don gia sp: "); this.donGia = sc.nextDouble();
        System.out.print("Giam gia: "); this.giamGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("-------------------------------");
        System.out.println("Ten sp: " + this.tenSp);
        System.out.printf("Don gia: %.2f\n", this.donGia);
        System.out.printf("Giam gia: %.2f\n", this.giamGia);
        System.out.printf("Thue NK: %.2f\n", this.getThueNK());
    }

    public static void main(String[] args) {
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
    }

}
