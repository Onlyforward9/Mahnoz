package Codeforces;

import java.util.Scanner;

public class m1585a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a < b) System.out.println("1");
            else if (a==b) System.out.println("2");
            else System.out.println(Math.min(Math.min(res(a, b + 1) + 1, res(a, b + 2) + 2), b != 1 ? res(a, b) : Integer.MAX_VALUE));
        }
    }

    public static int res(int a, int b) {
        int k = 0;
        while (a != 0) {
            a /= b;
            k++;
        }
        return k;
    }
}
