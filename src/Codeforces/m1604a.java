package Codeforces;

import java.util.Scanner;

public class m1604a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = 1;
            int k = 0;
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                if (a > l) {
                    k += (a - l);
                    l += (a - l);
                }
                l++;
            }
            System.out.println(k);
        }
    }
}
