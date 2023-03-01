import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai04 {

    public static void tuDaiNhat(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str);
        int Max, lengthStr;
        int i = 1;
        int viTriMax = i;
        Max = stringTokenizer.nextToken().length();
        while (stringTokenizer.hasMoreTokens()) {
            lengthStr = stringTokenizer.nextToken().length();
            i++;
            if (Max < lengthStr) {
                Max = lengthStr;
                viTriMax = i;
            }
        }
        System.out.println("Do dai xau lon nhat la: " + Max + " o vi tri " + viTriMax);
    }
    public static void main(String[] args) {
        System.out.print("Nhập xâu ký tự: ");
        String s = new Scanner(System.in).nextLine();
        tuDaiNhat(s);
    }

}
