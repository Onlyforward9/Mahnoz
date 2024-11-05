package Codeforces;

import java.util.Scanner;

public class m1207a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int b = sc.nextInt(), p = sc.nextInt(), f = sc.nextInt();
            int h = sc.nextInt(), c = sc.nextInt();
            long a = 0;
            if (h > c) {
                while (b >= 2 && p > 0) {
                    p--;
                    b -= 2;
                    a += h;
                }
                while (b >= 2 && f > 0) {
                    b -= 2;
                    f--;
                    a += c;
                }
            } else {
                while (b >= 2 && f > 0) {
                    b -= 2;
                    f--;
                    a += c;
                }
                while (b >= 2 && p > 0) {
                    b -= 2;
                    p--;
                    a += h;
                }
            }
            System.out.println(a);
        }
    }
}
