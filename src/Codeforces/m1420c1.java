package Codeforces;

import java.util.Scanner;

public class m1420c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long sum = 0;
            int max = sc.nextInt(),s=max;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                if (a > s) {
                    sum += (max - s);
                    max = a;
                }
                s = a;
            }
            System.out.println(sum + max);
        }
    }
}
// 4 9 5 1 3
// 4 3 8 9 11 2 1
//4 3 9