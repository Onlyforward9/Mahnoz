package Codeforces;

import java.util.Scanner;

public class m1879b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int min_a = Integer.MAX_VALUE;
            int min_b = min_a;
            long a = 0, b = 0;
            for (int i = 0; i < n; i++) {
                int aa = sc.nextInt();
                min_a = Math.min(min_a, aa);
                a += aa;
            }
            for (int i = 0; i < n; i++) {
                int bb = sc.nextInt();
                b += bb;
                min_b = Math.min(min_b, bb);
            }
            System.out.println(Math.min(a + (long) min_b * n, b + (long) min_a * n));
        }
    }
}
