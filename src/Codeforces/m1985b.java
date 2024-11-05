package Codeforces;

import java.util.Scanner;

public class m1985b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0, x = 1;
            for (int i = 2; i <= n; i++) {
                int k = 0;
                for (int j = 2; j <= n; j++) if (j % i == 0) k++;
                if (k >= max) {
                    max = k;
                    x = i;
                }
            }
            System.out.println(x);
        }
    }
}
