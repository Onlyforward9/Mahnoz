package Codeforces;

import java.util.Scanner;

public class m1806a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x1 = sc.nextLong(), y1 = sc.nextLong();
            long x2 = sc.nextLong(), y2 = sc.nextLong();
            long a = Math.abs(x1 - x2);
            long b = Math.abs(y1 - y2);
            if (a > b) System.out.println(-1);
            else System.out.println(a + ((b - a) * 2));
        }
    }
}
