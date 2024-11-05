package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1472c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }
            int[] dp = new int[n + 1];
            for (int i = n; i >= 1; i--) {
                dp[i] = arr[i];
                if (i + arr[i] <= n) {
                    dp[i] = dp[i] + dp[i + arr[i]];
                }
            }
            Arrays.sort(dp);
            System.out.println(dp[n]);
        }
    }
}
