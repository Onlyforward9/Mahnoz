package Codeforces;

import java.util.Scanner;

public class m1872c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = l % 2 == 0 ? l - 2 : l - 1;
            if (l <= 2) k = l % 2 == 0 ? l : l + 1;
            if (k + 2 <= r) System.out.println("2 " + k);
            else System.out.println(-1);
        }
    }
}
