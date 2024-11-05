package Codeforces;

import java.util.Scanner;

public class m1976b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            Integer[] b = new Integer[n + 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n + 1; i++) b[i] = sc.nextInt();
            int min = Integer.MAX_VALUE;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                min = Math.min(Math.abs(a[i] - b[n]), min);
                sum += Math.abs(a[i] - b[i]);
                if (a[i] <= b[i] && b[i] >= b[n] && a[i] <= b[n]) min = 0;
                if (b[i] <= a[i] && a[i] >= b[n] && b[i] <= b[n]) min = 0;
                min = Math.min(Math.abs(b[i] - b[n]), min);
            }
            System.out.println(sum + min + 1);
        }
    }
}
