package Codeforces;

import java.util.Scanner;

public class m1285b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long max2 = 0, max1 = 0, p = 0, s = 0;
            for (int i = 0; i < arr.length; i++) s += arr[i] = sc.nextInt();
            for (int i = 1; i < n; i++) {
                if (arr[i] + p >= 0) {
                    p += arr[i];
                    max1 = Math.max(max1, p);
                } else p = 0;
            }
            p=0;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] + p >= 0) {
                    p += arr[i];
                    max2 = Math.max(max2, p);
                } else p = 0;
            }
            System.out.println(s > Math.max(max1, max2) ? "YES" : "NO");
        }
    }
}
