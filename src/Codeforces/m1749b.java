package Codeforces;

import java.util.Scanner;

public class m1749b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long s = 0;
            for (int i = 0; i < n; i++) s += sc.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                s += b;
                max = Math.max(max, b);
            }
            System.out.println(s-max);
        }
    }
}
