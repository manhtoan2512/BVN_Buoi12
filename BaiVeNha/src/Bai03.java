import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai03 {

    public static String inHoa(String str) {
        String s, ketQua;
        s = str.substring(0, 1);
        ketQua = str.replaceFirst(s, s.toUpperCase());
        return (ketQua);
    }

    public static String chuanHoa(String str) {
        String ketQua = "";
        StringTokenizer strToken = new StringTokenizer(str, " ,\t,\r");
        ketQua += "" + inHoa(strToken.nextToken());
        while (strToken.hasMoreTokens()) {
            ketQua += " " + inHoa(strToken.nextToken());
        }
        return (ketQua);
    }

    public static void main(String[] args) {

        System.out.println("Nhập xâu: ");
        String s = new Scanner(System.in).nextLine();
        System.out.println("Xâu được chuẩn hóa là: " + chuanHoa(s));

    }

}
