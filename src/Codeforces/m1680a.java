package Codeforces;

import java.util.Scanner;

public class m1680a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l1 = sc.nextInt(), r1 = sc.nextInt();
            int l2 = sc.nextInt(), r2 = sc.nextInt();
            if (l1 <= l2 && l2 <= r1) System.out.println(l2);
            else if (l2 <= l1 && l1 <= r2) System.out.println(l1);
            else System.out.println(l1 + l2);
        }
    }
}
