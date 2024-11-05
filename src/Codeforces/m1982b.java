package Codeforces;

import java.util.Scanner;

public class m1982b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), x = sc.nextLong(), k = sc.nextLong();
            while (k > 0) {
                long p = Math.min(k, x - n % x);
                k -= p;
                n += p;
                while (n % x == 0) n /= x;
                if (n < x) break;
            }
            if (k == 0) System.out.println(n);
            else {
                long p = (k + n - 1) / (x - 1);
                System.out.println((k + n + p) % x);
            }
        }
    }
}
