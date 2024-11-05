package Codeforces;

import java.util.Scanner;

public class m1405b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long sum_1 = 0, p = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                p += a;
                if (p < 0) {
                    sum_1 += p * -1;
                    p = 0;
                }
            }
            System.out.println(sum_1);
        }
    }
}
