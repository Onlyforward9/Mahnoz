package Codeforces;

import java.util.Scanner;

public class m1985c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum = 0, k = 0, max = 0;
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                max=Math.max(max,arr[i]);
                if (sum-max==max)k++;
            }
            System.out.println(k);
        }
    }
}
