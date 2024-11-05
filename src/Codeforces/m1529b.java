package Codeforces;

import java.util.Scanner;

public class m1529b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long max1 = -Integer.MAX_VALUE;
            long max2 = -Integer.MAX_VALUE;
            long min = Integer.MAX_VALUE;
            int p1 = 0;
            for (int i = 0; i < n; i++) {
                long b = sc.nextLong();
                if (b > 0) min = Math.min(min, b);
                else {
                    if (b >= max1) {
                        max2 = max1;
                        max1 = b;
                    } else max2 = Math.max(max2, b);
                    p1++;
                }
            }
            if (Math.abs(max1 - max2) >= min) p1++;
            System.out.println(p1 == 0 ? 1 : p1);
        }
    }
}
