package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m607b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) dp[i][i] = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) dp[i][i + 1] = 1;
            else dp[i][i + 1] = 2;
            for (int l = 0; l < n; l++) System.out.println(Arrays.toString(dp[l]));
            System.out.println();
        }
        for (int l = 3; l <= n; l++) {
            for (int r = 0, c = l - 1; c < n; r++, c++) {
                if (a[r] == a[c]) dp[r][c] = dp[r + 1][c - 1];
                else dp[r][c] = Integer.MAX_VALUE;
                for (int m = r; m < c; m++)
                    dp[r][c] = Math.min(dp[r][c], dp[r][m] + dp[m + 1][c]);
                System.out.println(Arrays.toString(dp[r]));
            }
            System.out.println();
        }
        System.out.println();
        for (int l = 0; l < n; l++) System.out.println(Arrays.toString(dp[l]));
        System.out.println();
        System.out.println(dp[0][n - 1]);
    }
}
//1 4 4 2 3 2 1