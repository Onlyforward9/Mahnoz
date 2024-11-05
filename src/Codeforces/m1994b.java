package Codeforces;

import java.util.Scanner;

public class m1994b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next(), m = sc.next();
            int l = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == m.charAt(i) && s.charAt(i) == '1') break;
                if (s.charAt(i) != m.charAt(i)) {
                    if (s.charAt(i) == '0') l = 1;
                    break;
                }
            }
            System.out.println(l == 1 ? "NO" : "YES");
        }
    }
}