package Codeforces;

import java.util.Scanner;

public class m1065b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), m = sc.nextLong(), k = 0;
        if (m == 0) System.out.println(n + " " + n);
        else {
            while (k * k + k <= 2 * m) k++;
            k--;
            if (k * k + k != 2 * m) k++;
            long min = Math.max(n - m * 2, 0);
            System.out.println(min + " " + (n - k - 1));
        }
    }
}
