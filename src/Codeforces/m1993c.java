package Codeforces;

import java.util.Scanner;

public class m1993c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int min = k, max = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                max = Math.max(max, a);
            }
        }
    }
}
