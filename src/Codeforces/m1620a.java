package Codeforces;

import java.util.Scanner;

public class m1620a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String r = String.valueOf(s.charAt(0));
            for (int i = 1; i < s.length(); i++) {
                if (r.charAt(r.length() - 1) != s.charAt(i)) {
                    r += s.substring(i, i + 1);
                }
            }
            System.out.println(r.equals("EN") || r.equals("NE") || r.equals("ENE") ? "NO" : "YES");
        }
    }
}
