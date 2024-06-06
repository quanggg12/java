package OOP2.bt1;

import java.util.Scanner;

public class SinhVienKT extends SinhVien {
    private double kinhTe, luatKT;

    public SinhVienKT(int ma, String hoTen, String ngaySinh, String gioiTinh, double kinhTe, double luatKT) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.kinhTe = kinhTe;
        this.luatKT = luatKT;
    }
    
    public void setKinhTe(double kinhTe) {
        this.kinhTe = kinhTe;
    }

    public void setLuatKT(double luatKT) {
        this.luatKT = luatKT;
    }

    public double getKinhTe() {
        return this.kinhTe;
    }

    public double getLuatKT() {
        return this.luatKT;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap diem kinh te: ");
        this.kinhTe =  sc.nextDouble();
        System.out.println("Nhap diem luat kinh te: ");
        this.luatKT = sc.nextDouble();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Diem kinh te: " + this.kinhTe);
        System.out.println("Diem luat kinh te: " + this.luatKT);
        System.out.println("Diem trung binh: " + tinhDiemTB());
        System.out.println("Xep loai: " + xepLoai());
    }

    public double tinhDiemTB() {
        return (this.kinhTe + this.luatKT) / 2;
    }

    public String xepLoai() {
        double diem = tinhDiemTB();
        if (diem >= 8.5) {
            return "Xuat sac";
        } else if (diem >= 7) {
            return "Gioi";
        } else if (diem >= 5.5) {
            return "Kha";
        } else if (diem >= 4) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
}
 