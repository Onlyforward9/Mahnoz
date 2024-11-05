package Codeforces;

import java.util.Scanner;

public class m2022a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), r = sc.nextInt(), k = 0, res = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                k += a % 2;
                res += a / 2;
            }
            System.out.println(res * 2 + Math.min(r * 2 - (res * 2 + k), k));
        }
    }
}
