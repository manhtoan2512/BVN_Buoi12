import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai05 {

    public static String doiViTri(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        String ho = stringTokenizer.nextToken();
        String dem = stringTokenizer.nextToken();
        String ten = stringTokenizer.nextToken();
        return (ten + " " + ho + " " + dem);
    }

    public static void main(String[] args) {
        System.out.print("Nhập họ và tên : ");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Họ và tên sau khi sắp xếp: " + doiViTri(s));
    }

}
