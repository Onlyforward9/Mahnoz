package Codeforces;

import java.util.Scanner;

public class m1499a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k1 = sc.nextInt(), k2 = sc.nextInt();
            int w = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((k1 + k2) / 2 >= w && (2 * n - (k1 + k2)) / 2 >= b ? "YES" : "NO");
        }
    }
}
