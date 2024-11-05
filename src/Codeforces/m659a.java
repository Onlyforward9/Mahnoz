package Codeforces;

import java.util.Scanner;

public class m659a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > 0) {
            if ((a + b) % n == 0)
                System.out.println(n);
            else System.out.println((a + b) % n);
        } else {
            if ((b * -1) < a) System.out.println(a + b);
            else {
                b = (b * -1) - a;
                if (b % n == 0) {
                    System.out.println(n);
                } else System.out.println(n - (b % n));
            }
        }
    }
}
