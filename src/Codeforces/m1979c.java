package Codeforces;

import java.util.Scanner;

public class m1979c {
    public static long gc(long a, long b) {
        if (b == 0) return a;
        return gc(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long[] num = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long g = arr[0];
            long sm = 0;
            for (int i = 0; i < arr.length; i++) {
                g = g * arr[i] / (gc(g, arr[i]));
            }
            for (int i = 0; i < arr.length; i++) {
                num[i] = g / arr[i];
                sm += num[i];
            }
            if (sm >= g) System.out.println(-1);
            else {
                StringBuilder sb = new StringBuilder();
                for (long val : num) {
                    sb.append(val + " ");
                }
                System.out.println(sb);
            }
        }
    }
}
