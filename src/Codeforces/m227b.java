package Codeforces;

import java.util.Scanner;

public class m227b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) arr[sc.nextInt()] = i;
        int m = sc.nextInt();
        long a = 0, b = 0;
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            a+=arr[p];
            b+=(n-arr[p]+1);
        }
        System.out.println(a+" "+b);
    }
}
