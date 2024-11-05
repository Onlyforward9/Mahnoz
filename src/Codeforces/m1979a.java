package Codeforces;

import java.util.Scanner;

public class m1979a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int min = Integer.MAX_VALUE;
            while (n-- > 1) {
                int b = sc.nextInt();
                min = Math.min(min, Math.max(b, a));
                a = b;
            }
            System.out.println(min - 1);
        }
    }
}
