package Codeforces;

import java.util.Scanner;

public class m1245c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int mod = 1000000007;
        if (s.contains("m") || s.contains("w")) System.out.println(0);
        else {
            s+="p";
            long res = 1, kn = 0, ku = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'n') kn++;
                else {
                    res = (res * (fib(kn)) + mod) % mod;
                    kn = 0;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'u') ku++;
                else {
                    res = (res * (fib(ku)) + mod) % mod;
                    ku = 0;
                }
            }
            System.out.println(res);
        }
    }

    public static long fib(long n) {
        long a = 1, b = 1;
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            for (int i = 3; i <= n; i++) {
                b += a;
                a += b;
                b %= 1000000007;
                a %= 1000000007;
            }
            return a;
        }
    }
}
//nnn-mn nm -3
//nnnn=mnn nmn nnm mm -5
//nnnnn=mnnn nmnn nnmn nnnm mmn mnm nmm -8
//nnnnnn=mnnnn nmnnn nnmnn nnnmn nnnnm mmnn mnmn mnnm nmmn nmnm nnmm mmm -13
///0 1 1 2