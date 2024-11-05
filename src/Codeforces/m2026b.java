package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m2026b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
            long max1 = 0;
            for (int i = 0; i < n - 1; i+=2) max1 = Math.max(arr[i + 1] - arr[i], max1);
            if (n % 2 == 0) System.out.println(max1);
            else if (n == 1) System.out.println(1);
            else {
                long min = Long.MAX_VALUE;
                for (int i = 0; i < n; i += 2) {
                    long max = 0;
                    for (int j = 0; j < i; j += 2)
                        max = Math.max(max, arr[j + 1] - arr[j]);
                    for (int j = i + 1; j < n - 1; j += 2)
                        max = Math.max(max, arr[j + 1] - arr[j]);
                    min = Math.min(min, max);
                }
                System.out.println(min);
            }
        }
    }
}
