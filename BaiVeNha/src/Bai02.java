import java.util.Scanner;

public class Bai02 {

    public static void main(String[] args) {

        System.out.print("Nhập xâu ký tự: ");
        String s = new Scanner(System.in).nextLine();

        String str = new String(s);
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i = i + 2) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        System.out.println(new String(chars));
    }

}
