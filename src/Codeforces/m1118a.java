package Codeforces;

import java.util.Scanner;

public class m1118a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), a = sc.nextLong(), b = sc.nextLong();
            long min = Math.min(a * 2, b) * (n / 2);
            System.out.println(n % 2 == 1 ? min + a : min);
        }
    }
}
