package Codeforces;

import java.util.Scanner;

public class m2032a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k1 = 0, k0 = 0;
            for (int i = 0; i < n + n; i++) {
                if (sc.nextInt() == 1) k1++;
                else k0++;
            }
            System.out.print(k1 % 2 == 0 ? 0 : 1);
            System.out.println(" "+Math.min(k1, k0));
        }
    }
}
