package Codeforces;

import java.util.Scanner;

public class m2007a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            a -= a % 2;
            b += b % 2;
            System.out.println(((b - a) / 2) / 2);
        }
    }
}
