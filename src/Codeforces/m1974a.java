package Codeforces;

import java.util.Scanner;

public class m1974a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = (y + 1) / 2;
            x -= (a * 7);
            if (y % 2 == 1) x -= 4;
            if (x > 0) {
                a += (x % 15 == 0 ? x / 15 : x / 15 + 1);
            }
            System.out.println(a);
        }
    }
}
