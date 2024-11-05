package Codeforces;

import java.util.Scanner;

public class m245a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a1 = 0, a2 = 0, b1 = 0, b2 = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                a1 += sc.nextInt();
                a2 += sc.nextInt();
            } else {
                b1 += sc.nextInt();
                b2 += sc.nextInt();
            }
        }
        System.out.println(a1 * 2 >= (a1 + a2) ? "LIVE" : "DEAD");
        System.out.println(b1 * 2 >= (b1 + b2) ? "LIVE" : "DEAD");
    }
}
