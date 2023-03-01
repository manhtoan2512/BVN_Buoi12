public class Bai01 {
    public static void main(String[] args) {
        String s, s1;

        for (int i = 100000; i < 1000000; i++) {
            s = "";
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(i));
            s += i;
            s1 = stringBuilder.reverse().toString();
            if (s.compareTo(s1) == 0) {
                System.out.println(i);
            }
        }
    }

}