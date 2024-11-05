package Codeforces;

import java.util.Scanner;

public class m1619c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            long a = sc.nextLong(), s = sc.nextLong();
            String b = "";
            boolean ok = false;
            while (s != 0) {
                long a1 = a % 10;
                a /= 10;
                long s1 = s % 10;
                s /= 10;
                if (s1 >= a1) b = s1 - a1 + b;
                else {
                    if (s % 10 != 1) {
                        System.out.println(-1);
                        ok = true;
                        break;
                    } else {
                        s1 = s1 + 10;
                        s /= 10;
                        b = s1 - a1 + b;
                    }
                }
            }
            if (a != 0 && !ok) System.out.println(-1);
            else if (!ok) System.out.println(Long.parseLong(b));
        }
    }
}