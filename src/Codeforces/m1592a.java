package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class m1592a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long h = sc.nextLong();
            long max_1 = 0, max_0 = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                if (a >= max_1) {
                    max_0 = max_1;
                    max_1 = a;
                } else if (a >= max_0) max_0 = a;
            }
            if (h <= max_1) pw.println(1);
            else {
                long k = 0;
                long m = max_0 + max_1;
                long p = h / m - 1;
                h -= (p * m);
                k += (p * 2);
                long i = 0;
                while (h > 0) {
                    if (i % 2 == 0) h -= max_1;
                    else h -= max_0;
                    i++;
                }
                pw.println(k + i);
            }
        }
        pw.close();
    }
}
