import java.util.Scanner;

public class Bai07 {

    public static String loaiBoKyTu(String S1, String S2) {
        for (int i = 0; i < S2.length(); i++) {
            char n = S2.charAt(i);
            while (S1.contains(n + "")) {
                S1 = S1.replace((n + ""), "");
            }
        }
        return S1;
    }

    public static void main(String[] args) {

        System.out.println("Nhập xâu S1: ");
        String S1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập xâu S2: ");
        String S2 = new Scanner(System.in).nextLine();
        System.out.println(loaiBoKyTu(S1, S2));

    }
}
