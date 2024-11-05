package Codeforces;

import java.util.Scanner;

public class m1762a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), min = 32, sum = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(), k = 0, p = a % 2;
                sum += a;
                while (a % 2 == p) {
                    a /= 2;
                    k++;
                }
                min = Math.min(min, k);
            }
            System.out.println(sum % 2 == 0 ? 0 : min);
        }
    }
}
