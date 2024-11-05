package Codeforces;

import java.util.Scanner;

public class m1027a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String a = "abcdefghijklmnopqrstuvwxyz";
            String res = "YES";
            for (int i = 0; i < n / 2; i++) {
                int l = a.indexOf(s.substring(i, i + 1));
                int k = a.indexOf(s.substring((n - i - 1), (n - i)));
                if (s.charAt(i) != s.charAt(n - i - 1) && Math.abs(l - k) != 2) {
                    res = "NO";
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
