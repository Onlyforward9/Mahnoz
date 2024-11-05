package Codeforces;

import java.util.Scanner;

public class m524b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = Integer.MAX_VALUE;
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        out:for (int i = 1; i <= 1000; i++) {
            int w = 0, h = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] <= i && b[j] <= i) w += Math.min(a[j], b[j]);
                else if (a[j] <= i) w += b[j];
                else if (b[j] <= i) w += a[j];
                else continue out;
                h = i;
            }
            res = Math.min(res, h * w);
        }
        System.out.println(res);
    }
}
