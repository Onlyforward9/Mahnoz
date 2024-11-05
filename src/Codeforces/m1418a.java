package Codeforces;

import java.util.Scanner;

public class m1418a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            long res = k;
            long palka = k + (y * k);
            long p = 1;
            while (p * x > 0 && p * x < palka) {
                res += p;
                p *= x;
            }
            palka -= p;
            res += palka % (x-1) == 0 ? palka / (x-1) : palka / (x-1) + 1;
            System.out.println(res);
        }
    }
}
