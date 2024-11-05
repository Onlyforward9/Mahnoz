package Codeforces;

import java.util.Scanner;

public class m1946b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] arr = new Integer[n];
            long res = 0, max = 0, p = 0;
            long l = 1000000007;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                res += arr[i];
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] + p >= 0) {
                    p += arr[i];
                    max = Math.max(max, p);
                } else p = 0;
            }
            while (k-- > 0) {
                res = (l + res + max) % l;
                max = (l + max + max) % l;
            }
            System.out.println(res);
        }
    }
}