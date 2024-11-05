package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1097b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) sum += arr[i] = sc.nextInt();
        boolean[] dp = new boolean[3601];
        dp[0] = true;
        for (int k : arr) for (int j = sum; j >= k; j--) dp[j] = dp[j] || dp[j - k];
        if (sum % 2 == 1) System.out.println("NO");
        else {
            for (int i = 0; i <= sum / 360; i++) {
                if ((sum % 360 + (360 * i)) % 2 == 0 && dp[(sum % 360 + (360 * i)) / 2]) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }
    }
}
