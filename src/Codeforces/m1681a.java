package Codeforces;

import java.util.Scanner;

public class m1681a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max_a = 0, max_b = 0;
            for (int i = 0; i < n; i++) max_a = Math.max(max_a, sc.nextInt());
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) max_b = Math.max(max_b, sc.nextInt());
            if (max_a > max_b) System.out.println("Alice\nAlice");
            else if (max_b > max_a) System.out.println("Bob\nBob");
            else if (n > m) System.out.println("Alice\nBob");
            else System.out.println("Bob\nBob");
        }
    }
}
