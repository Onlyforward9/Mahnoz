package acmp;

import java.util.Scanner;

public class mb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            String s = "YES";
            for (int i = 0; i < a.length(); i++) {
                if (c.charAt(i) != b.charAt(i) && c.charAt(i) != a.charAt(i)) {
                    s = "NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
