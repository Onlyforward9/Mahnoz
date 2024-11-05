package Codeforces;

import java.util.Scanner;

public class m1422c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long mod = 1000000007;
        char s[] = sc.next().toCharArray();
        long value[] = new long[s.length + 1];
        for (int i = 0; i < s.length; i++) {
            value[i + 1] = (10 * value[i] + (s[i] - '0')) % mod;
        }
        long sum[] = new long[s.length + 1];
        for (int i = 1; i <= s.length; i++) {
            sum[i] = (sum[i - 1] + value[i]) % mod;
        }
        long ans = 0;
        for (int i = 0; i < s.length; i++) {
            ans *= 10;
            long remlen = i;
            ans += (s[i] - '0') * (remlen * (remlen + 1) / 2);
            ans %= mod;
            ans += sum[i];
            ans %= mod;
        }
        System.out.println(ans);
    }
}
