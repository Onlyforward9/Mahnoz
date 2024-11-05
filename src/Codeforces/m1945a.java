package Codeforces;

import java.util.Scanner;

public class m1945a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            if (b % 3 == 0) System.out.println(a + (b / 3) + (c % 3 == 0 ? c / 3 : c / 3 + 1));
            else {
                if ((b % 3 == 1 && c < 2) || (b % 3 == 2 && c < 1))
                    System.out.println(-1);
                else {
                    c -= (3 - b % 3);
                    b += (3 - b % 3);
                    System.out.println(a + b / 3 + (c % 3 == 0 ? c / 3 : c / 3 + 1));
                }
            }
        }
    }
}
