package Codeforces;

import java.util.Scanner;

public class m1065a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long s = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
            long sh = s / c;
            long r = sh % a;
            r += (b * (sh / a));
            r+=(a*(sh/a));
            System.out.println(r);
        }
    }
}
