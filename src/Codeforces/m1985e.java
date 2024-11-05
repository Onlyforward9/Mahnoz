package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1985e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong();
            long z = sc.nextLong(), x = sc.nextLong();
            long max = 0;
            for (long i = 1; i * i <= x; i++) {
                if (x % i == 0) {
                    long p = x / i;
                    long o = i;
                    for (long j = 1; j * j <= p; j++) {
                        if (p % j == 0) {
                            max = Math.max(max, solve(a, b, j, p / j, z, i));
                            max = Math.max(max, solve(a, b, p / j, j, z, i));
                        }
                    }
                    for (long j = 1; j * j <= o; j++) {
                        if (o % j == 0) {
                            max = Math.max(max, solve(a, b, j, o / j, z, p));
                            max = Math.max(max, solve(a, b, o / j, j, z, p));
                        }
                    }
                }
            }
            pw.println(max);
        }
        pw.close();
    }

    public static long solve(long a, long b, long x, long y, long z, long i) {
        if (b - y >= 0 && a - x >= 0 && z - i >= 0)
            return ((b - y + 1) * (a - x + 1)) * (z - i + 1);
        else return 0;
    }
}
