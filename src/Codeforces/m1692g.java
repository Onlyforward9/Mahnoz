package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1692g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int s = sc.nextInt(),res=0,l=1;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                if (a * 2 > s) l++;
                else {
                    res+=(Math.max(0,l-k));
                    l=1;
                }
                s = a;
            }
            res+=(Math.max(0,l-k));
            System.out.println(res);
        }
    }
}
