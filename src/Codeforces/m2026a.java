package Codeforces;

import java.util.Scanner;

public class m2026a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
            int min = Math.min(a, b);
            System.out.println("0 0 " + min + " " + min);
            System.out.println(min + " 0 0 " + min);
        }
    }
}
