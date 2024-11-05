package Codeforces;

import java.util.Scanner;

public class m1444a {
    static long p, q;
    static long ans;

    public static void f(long x) {
        long t = p;
        while (t % q == 0) t /= x;
        ans = Math.max(ans, t);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            p = sc.nextLong();
            q = sc.nextLong();
            if (p % q != 0) System.out.println(p);
            else {
                ans = 1;
                long x = q;
                for (long i = 2; i * i <= x; i++) {
                    if (x % i == 0) f(i);
                    while (x % i == 0) x /= i;
                }
                if (x > 1) f(x);
                System.out.println(ans);
            }
        }
    }
}
