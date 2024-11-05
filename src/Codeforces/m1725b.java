package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1725b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong() + 1;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
        Arrays.sort(arr);
        int k = 0, j = n, i = n - 1;
        while (i >= 0) {
            long p = d % arr[i] == 0 ? d / arr[i] : d / arr[i] + 1;
            if (j >= p) {
                k++;
                j -= p;
                i--;
            } else break;
        }
        System.out.println(k);
    }
}
