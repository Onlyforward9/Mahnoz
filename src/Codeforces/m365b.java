package Codeforces;

import java.util.Scanner;

public class m365b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 2) System.out.println(n);
        else {
            long a = sc.nextLong(), b = sc.nextLong();
            int k = 2, max = 2;
            for (int i = 2; i < n; i++) {
                long s = sc.nextLong();
                if (a + b == s) {
                    k++;
                    max = Math.max(max, k);
                } else {
                    k = 2;
                }
                a = b;
                b = s;
            }
            System.out.println(max);
        }
    }
}
