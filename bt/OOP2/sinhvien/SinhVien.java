package OOP2.bt1;

import java.util.Scanner;

public class SinhVien {
    private int ma;
    private String hoTen, ngaySinh, gioiTinh;
    
    public SinhVien(int ma, String hoTen, String ngaySinh, String gioiTinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public int getMa() {
        return this.ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return this.ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return this.gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma: ");
        this.ma = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        this.gioiTinh = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Ma: " + this.ma);
        System.out.println("Ho ten: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh);
        System.out.println("Gioi tinh: " + this.gioiTinh);
    }
}
