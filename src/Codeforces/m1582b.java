package Codeforces;

import java.util.Scanner;

public class m1582b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(), k1 = 0, k0 = 1;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                if (a == 1) k1++;
                else if (a == 0) k0*=2;
            }
            System.out.println(k0 * k1);
        }
    }
}
