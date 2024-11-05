package Codeforces;

import java.util.Scanner;

public class m2022b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = sc.nextInt(), max = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                max = Math.max(max, a);
                sum += a;
            }
            sum = sum % x == 0 ? sum / x : sum / x + 1;
            System.out.println(Math.max(max,sum));
        }
    }
}
