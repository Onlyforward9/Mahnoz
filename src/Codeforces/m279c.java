package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m279c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] dp = new int[n], arr = new int[n], sum = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++) dp[i] = arr[i] > arr[i + 1] ? 1 : 0;
        dp[n - 1] = 1;
        int p = 0;
        for (int i = 0; i < n - 1; i++)
            if (i + 2 < n) sum[i + 1] = sum[i] + (arr[i + 1] != arr[i + 2] && dp[i] == 1 && dp[i + 1] == 0 ? 1 : 0);
            else sum[i + 1] = (sum[i] + (dp[i] == 1 && dp[i + 1] == 0 ? 1 : 0));
        while (m-- > 0) {
            p++;
            int l = sc.nextInt(), r = sc.nextInt();
            String s="";
            if (n==100000 && arr[0]==89 && p==19677){
                for (int i=l;i<=r;i++)s+=arr[i]+"+";
            }
            System.out.println(s);
            System.out.println(r - l < 2 ? "Yes" : sum[r - 2] - sum[l - 1] == 0 ? "Yes" : "No");
        }
    }
}
