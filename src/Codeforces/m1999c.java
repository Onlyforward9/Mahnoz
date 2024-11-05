package Codeforces;

import java.util.Scanner;

public class m1999c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s = sc.nextInt(), m = sc.nextInt();
            int max = 0, st = 0;
            while (n-- > 0) {
                int l = sc.nextInt(), r = sc.nextInt();
                max = Math.max(max, l - st);
                st = r;
            }
            max=Math.max(max,m-st);
            System.out.println(max>=s?"YES":"NO");
        }
    }
}
