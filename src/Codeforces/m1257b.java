package Codeforces;

import java.util.Scanner;

public class m1257b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong();
            if (a >= b) System.out.println("YES");
            else {
                long p;
                do {
                    p = a;
                    a = (long) ((a % 2 == 0 ? a : a - 1) * 1.5);
                } while (p != a);
                System.out.println(a >= b ? "YES" : "NO");
            }
        }
    }
}
