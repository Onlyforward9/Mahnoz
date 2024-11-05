package Codeforces;

import java.util.*;

public class m1620b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), m = sc.nextLong(), l = sc.nextLong();
            long[] a = new long[(int) l];
            for (int i = 0; i < l; i++) a[i] = sc.nextLong();
            l = sc.nextLong();
            long[] b = new long[(int) l];
            for (int i = 0; i < l; i++) b[i] = sc.nextLong();
            l = sc.nextLong();
            long[] c = new long[(int) l];
            for (int i = 0; i < l; i++) c[i] = sc.nextLong();
            l = sc.nextLong();
            long[] d = new long[(int) l];
            for (int i = 0; i < l; i++) d[i] = sc.nextLong();
            long aa = (a[a.length - 1] - a[0]) * m;
            long bb = (b[b.length - 1] - b[0]) * m;
            long cc = (c[c.length - 1] - c[0]) * n;
            long dd = (d[d.length - 1] - d[0]) * n;
            System.out.println(Math.max(aa, Math.max(bb, Math.max(cc, dd))));
        }
    }
}