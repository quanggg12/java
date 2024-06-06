package OOP2.bt1;
import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
    private double diemCTDL;
    private double diemCSDL;
    private double diemToanRR;

    public SinhVienCNTT(int ma, String hoTen, String ngaySinh, String gioiTinh, double diemCTDL, double diemCSDL, double diemToanRR) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.diemCTDL = diemCTDL;
        this.diemCSDL = diemCSDL;
        this.diemToanRR = diemToanRR;
    }

    public double getDiemCTDL() {
        return this.diemCTDL;
    }

    public void setDiemCTDL(double diemCTDL) {
        this.diemCTDL = diemCTDL;
    }

    public double getDiemCSDL() {
        return this.diemCSDL;
    }

    public void setDiemCSDL(double diemCSDL) {
        this.diemCSDL = diemCSDL;
    }

    public double getDiemToanRR() {
        return this.diemToanRR;
    }

    public void setDiemToanRR(double diemToanRR) {
        this.diemToanRR = diemToanRR;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap diem CTDL: ");
        this.diemCTDL = sc.nextDouble();
        System.out.println("Nhap diem CSDL: ");
        this.diemCSDL = sc.nextDouble();
        System.out.println("Nhap diem Toan RR: ");
        this.diemToanRR = sc.nextDouble();
    }

    public void xuat() {
        // System.out.println("Ma: " + super.getMa());
        // System.out.println("Ho ten: " + super.getHoTen());
        // System.out.println("Ngay sinh: " + super.getNgaySinh());
        // System.out.println("Gioi tinh: " + super.getGioiTinh());
        super.xuat();
        System.out.println("Điem CTDL: " + this.diemCTDL);
        System.out.println("Điem CSDL: " + this.diemCSDL);
        System.out.println("Điem Toan RR: " + this.diemToanRR);
        System.out.println("Điem trung binh: " + tinhDiemTB());
        System.out.println("Xep loai: " + xepLoai());
    }

    public double tinhDiemTB() {
        return (this.diemCTDL + this.diemCSDL + this.diemToanRR) / 3;
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

//    public static void main(String[] args) {
//        SinhVienCNTT sv1 = new SinhVienCNTT(123, "Messi", "1/1/1", "nam", 5.5, 6.8, 9.0);
//        sv1.xuat();
//    }
}