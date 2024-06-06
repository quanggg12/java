import java.util.Scanner;
// import Ham.KeyBoard;

public class SinhVien {
    private String hoTen, diaChi, gioiTinh;
    private double diem;

    public SinhVien(String hoTen, String diaChi, String gioiTinh, double diem) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public SinhVien() {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: "); setHoTen(sc.nextLine());
        System.out.println("Nhap dia chi: "); setDiaChi(sc.nextLine());
        System.out.println("Nhap gioi tinh: "); setGioiTinh(sc.nextLine());
        System.out.println("Nhap diem: "); setDiem(sc.nextDouble());
    }

    public void xuat() {
        System.out.print(getHoTen());
        System.out.print(getDiaChi());
        System.out.print(getHoTen());
        System.out.print(getDiem());
        System.out.print(xep_loai());
    }

    public String xep_loai() {
        if (getDiem() >= 8) return "gioi";
        if (getDiem() > 6 && getDiem() < 8) return "kha";
        else return "trung binh";
    }

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Quang", "HN", "nam", 5);
        SinhVien sv2 = new SinhVien("Nam", "HN", "nam", 4);
        sv1.nhap();
        sv2.nhap();
        sv1.xuat();
        sv2.xuat();
    }
}
