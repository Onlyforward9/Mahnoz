package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1980d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n - 1];
            int[] num = new int[n];
            int a = sc.nextInt();
            num[0] = a;
            for (int i = 0; i < n - 1; i++) {
                int b = sc.nextInt();
                arr[i] = gcd(a, b);
                a = b;
                num[i + 1] = b;
            }
            int k = 0, i = 1;
            for (; i < arr.length - 2; i++) if (arr[i] < arr[i - 1]) break;
            if (i == arr.length - 2) System.out.println("YES");
            else {
                i = 0;
                int start = 0, end = n - 1;
                for (; i < n; i++) {
                    if (i == 0 && i != n - 1) {

                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(k <= 1 ? "YES" : "NO");
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
