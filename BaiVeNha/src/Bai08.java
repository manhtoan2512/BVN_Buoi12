import java.util.Scanner;

public class Bai08 {

    public static void main(String[] args) {
        System.out.print("Nhập xâu S1: ");
        String S1 = new Scanner(System.in).nextLine();
        System.out.print("Nhập xâu S2: ");
        String S2 = new Scanner(System.in).nextLine();
        timKiem(S1,S2);
    }

    private static void timKiem(String S1, String S2) {
        int i = S1.indexOf(S2);
        System.out.println(i);
    }

}
