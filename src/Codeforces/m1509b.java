package Codeforces;

import java.util.Scanner;

public class m1509b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int k = 0;
            boolean b = true;
            int m = (s.length() - s.replace("T", "").length()) / 2;
            for (int i = 0; i <= s.length(); i++) {
                if (s.charAt(i) == 'T') {
                    k++;
                    if (k > m) {
                        b = false;
                        break;
                    }
                } else {
                    k--;
                    if (k < 0) {
                        b = false;
                        break;
                    }
                }
            }
            System.out.println(k == m && b ? "YES" : "NO");
        }
    }
}
