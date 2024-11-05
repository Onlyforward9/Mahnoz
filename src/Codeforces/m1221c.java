package Codeforces;

import java.util.Scanner;

public class m1221c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            int m1 = Math.min(a, Math.min(b, c));
            a -= m1;
            b -= m1;
            c -= m1;
            if (a == 0 || b == 0) System.out.println(m1);
            else {
                int p1 = Math.min(a, b / 2);
                int p2 = Math.min(a / 2, b);
                int p3 = Math.min(a, Math.min(b, (a + b) / 3));
                System.out.println(m1 + Math.max(p1, Math.max(p2, p3)));
            }
        }
    }
}
