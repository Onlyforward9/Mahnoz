package Codeforces;

import java.util.Scanner;

public class m1426b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            String res = "NO";
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                int c = sc.nextInt(), d = sc.nextInt();
                if (b == c) res = "YES";
            }
            System.out.println(m % 2 == 0 ? res : "NO");
        }
    }
}
