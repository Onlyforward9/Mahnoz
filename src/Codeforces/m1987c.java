package Codeforces;

import java.util.Scanner;

public class m1987c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            long se = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i]<=se)se++;
                else se+=arr[i]-se;
            }
            System.out.println(se);
        }
    }
}
