package Ham;
import java.util.Scanner;

public class KeyBoard {
    static Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        String input = sc.nextLine();
        return input;
    }

    public static int readInt(String message) {
        System.out.print(message);
        int in = sc.nextInt();
        return in;
    }

    public static double readDouble(String message) {
        System.out.print(message);
        double in = sc.nextDouble();
        return in;
    }

    public static void main(String[] args) {
            
    }
}
