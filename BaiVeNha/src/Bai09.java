import java.util.Scanner;

public class Bai09 {

    public static void main(String[] args) {

        System.out.println("Nhập xâu S1: ");
        String S1 = new Scanner(System.in).nextLine();
        System.out.println("Nhập xâu S2: ");
        String S2 = new Scanner(System.in).nextLine();
        System.out.println("Nhập vị trí cần chèn: ");
        int viTri = new Scanner(System.in).nextInt();
        chen(S1,S2,viTri);

    }

    private static void chen(String S1, String S2, int viTri) {
        StringBuilder stringBuilder = new StringBuilder(S1);
        stringBuilder.insert(viTri,S2);
        System.out.println(stringBuilder);
    }

}
