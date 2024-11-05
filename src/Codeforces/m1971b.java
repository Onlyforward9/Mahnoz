package Codeforces;

import java.util.Scanner;

public class m1971b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int in = -1;
            for (int i = 0; i < s.length(); i++) if (s.charAt(i) != s.charAt(0)) in = i;
            System.out.println(in == -1 ? "NO" : "YES\n" + s.charAt(in) + "" + s.substring(0, in) + s.substring(in + 1));
        }
    }
}
