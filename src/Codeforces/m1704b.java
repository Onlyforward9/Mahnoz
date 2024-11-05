package Codeforces;

import java.util.Scanner;

public class m1704b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int max = 0;
            int l = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                min = Math.min(min, a);
                max = Math.max(max, a);
                if ((max - min) > 2 * k) {
                    l++;
                    max = a;
                    min = a;
                }
            }
            System.out.println(l);
        }
    }
}
