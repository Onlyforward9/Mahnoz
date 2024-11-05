package Codeforces;

import java.util.Scanner;

public class m2025b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[100001];
        int mod = 1000000007;
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) arr[i] = (arr[i - 1] * 2 + mod) % mod;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) sc.nextInt();
        for (int i=0;i<n;i++) System.out.println(arr[sc.nextInt()]);
    }
}
