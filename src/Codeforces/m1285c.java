package Codeforces;

import java.util.Scanner;

public class m1285c {
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        long r = a % b;
        return gcd(b, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long p = 1;
        for (long i = 2; i <= Math.sqrt(x) + 1; i++) {
            if (x % i == 0) {
                if (gcd(Math.max(i, x / i),Math.min(i, x / i)) == 1)
                    p = i;
            }
        }
        System.out.println(p + " " + (x / p));
    }
}
//k=a*b/gcd
//4 10-20
//4 5-20
//10 2