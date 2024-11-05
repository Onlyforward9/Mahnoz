package Codeforces;

import java.util.Scanner;

public class m474d {
    public static void main(String[] args) {
        final int m = 1000000007;
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(), k = input.nextInt(), n = 100002;
        int[] a = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < k) {
                a[i] = 1;
                sum[i] = i + 1;
            } else {
                a[i] = (a[i - k] + a[i - 1]) % m;
                sum[i] = (a[i] + sum[i - 1]) % m;
            }

        }
        for (int i = 0; i < t; i++) {
            int b = input.nextInt(), e = input.nextInt();
            System.out.println((sum[e] - sum[b - 1] + m) % m);
        }
    }
}
