package Codeforces;

import java.util.Scanner;

public class m1668b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int res = 0;
            for (int i = 1; i < n - 1; i++) res += arr[i] > arr[i - 1] + arr[i + 1] ? 1 : 0;
            System.out.println(k == 1 ? (n - 1) / 2 : res);
        }
    }
}
