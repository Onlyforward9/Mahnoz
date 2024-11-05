package Codeforces;

import java.util.Scanner;

public class m1999b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            System.out.println(s1(a, b, c, d) + s2(a, b, c, d) + s3(a, b, c, d) + s4(a, b, c, d));
        }
    }

    public static int s1(int a, int b, int c, int d) {
        int l1 = 0, l2 = 0;
        if (a > c) l1++;
        if (c > a) l2++;
        if (b > d) l1++;
        if (d > b) l2++;
        return l1 > l2 ? 1 : 0;
    }

    public static int s2(int a, int b, int c, int d) {
        int l1 = 0, l2 = 0;
        if (a > d) l1++;
        if (d > a) l2++;
        if (b > c) l1++;
        if (c > b) l2++;
        return l1 > l2 ? 1 : 0;
    }

    public static int s3(int a, int b, int c, int d) {
        int l1 = 0, l2 = 0;
        if (b > c) l1++;
        if (c > b) l2++;
        if (a > d) l1++;
        if (d > a) l2++;
        return l1 > l2 ? 1 : 0;
    }

    public static int s4(int a, int b, int c, int d) {
        int l1 = 0, l2 = 0;
        if (b > d) l1++;
        if (d > b) l2++;
        if (a > c) l1++;
        if (c > a) l2++;
        return l1 > l2 ? 1 : 0;
    }
}
