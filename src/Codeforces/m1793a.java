package Codeforces;

import java.util.Scanner;

public class m1793a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong();
            long n = sc.nextLong(), m = sc.nextLong() + 1;
            long aa = b * n;
            long bb = ((n / m) * (m - 1) * a) + (n % m) * Math.min(a, b);
            System.out.println(Math.min(aa,bb));
        }
    }
}
