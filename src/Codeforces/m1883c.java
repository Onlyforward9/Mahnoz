package Codeforces;

import java.util.Scanner;

public class m1883c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int min = 5;
            int k1 = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % k == 0) min = 0;
                else {
                    if (a % 2 == 0) k1++;
                    min = Math.min(min, k - (a % k));
                }
            }
            System.out.println(k==4?Math.min(min,Math.max(0,2-k1)):min);
        }
    }
}
//18*6=108
//108/4=27
//2,2,3
//1,1,1,2,2,2-3
//1,1,1,1,2,2,2,3,3,3-5
