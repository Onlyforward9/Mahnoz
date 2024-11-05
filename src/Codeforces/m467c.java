package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m467c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        long p = 0;
        long[] sum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            p = sc.nextLong();
            sum[i] = sum[i - 1] + p;
        }
        long[][] dp = new long[k + 1][n + 1];
        for (int i = 1; i <= k; i++)
            for (int j = m; j <= n; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j - m] + sum[j] - sum[j - m]);
                System.out.println(Arrays.toString(dp[i]));
            }
        System.out.println(dp[k][n]);
    }
}
