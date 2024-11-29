import java.util.Scanner;

// System.arraycopy
//StringBuilder - dung khi ghep chuoi dai, dung append
// charAt(index) - lay ki tu tai vi tri index


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, pass;
        int cnt = 0; 

        while (cnt < 3) {
            System.out.print("Nhập tên: ");
            name = sc.nextLine();
            System.out.print("Nhập mật khẩu: ");
            pass = sc.nextLine();

            if (name.equalsIgnoreCase("hello") && pass.length() > 6) {
                System.out.println("Nhập đúng");
                show();
                tach_ht();
                break; 
            } else {
                cnt++; 
                System.out.println("Tên hoặc mật khẩu không đúng. Vui lòng thử lại (" + cnt + "/3 lần)");
            }
        }

        if (cnt == 3) {
            System.out.println("Bạn đã nhập sai 3 lần");
        }
    }

    public static void show(){
        Scanner sc = new Scanner(System.in);
        String sv[] = {"Nguyen Van An", "Le Thanh Binh", "Tran Ba Kien", "Le Hien", "Dinh Thi An"};
        System.out.println("-------------------------");

        // in ds ten viet hoa
        System.out.println("1.Danh sach ten viet hoa: ");
        for(String x : sv){
            System.out.println(x.toUpperCase());
        }

        // in ds sinh vien co ho Le hoac Nguyen
        System.out.println("\nDanh sach sinh vien co ho Le hoac Nguyen");
        for(String x : sv){
            if(x.startsWith("Le") || x.startsWith("Nguyen")) System.out.println(x);
        }

        // In danh sach sinh vien co ten nhap tu ban phim
        System.out.println("Nhap ten can tim: ");
        String ht = sc.nextLine();
        System.out.println("Danh sach sinh vien co ten" + ht);
        for(String x : sv){
            if(x.endsWith(ht)) System.out.println(x);
        }

        //In danh sach sv co ho, dem, ten la Thanh4sq
        System.out.println("\nDanh sach sv co ho, dem, ten la Than: ");
        for(String x : sv){
            if(x.contains("Thanh")) System.out.println(x);
        }
    }

    public static void tach_ht(){
        String s = "Cong Tang Ton Nu Nguyen Thi Lung Ling";
        String[] a = s.split("\\s+");
        System.out.println("Ho: " + a[0]);
        System.out.println("Dem: ");
        for(int i = 1; i < a.length - 1; i++) System.out.print(a[i] + " ");
        System.out.println("Ten: " + a[a.length - 1]);


    }

}





















