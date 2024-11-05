package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m1767a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt(), a2 = sc.nextInt();
            int b1 = sc.nextInt(), b2 = sc.nextInt();
            int c1 = sc.nextInt(), c2 = sc.nextInt();
            String s = "YES";
            if (a1 == b1 && (c2 == a2 || c2 == b2)) s = "NO";
            if (a1 == c1 && (b2 == a2 || b2 == c2)) s = "NO";
            if (b1 == c1 && (a2 == b2 || a2 == c2)) s = "NO";
            if (a2 == b2 && (c1 == a1 || c1 == b1)) s = "NO";
            if (a2 == c2 && (b1 == a1 || b1 == c1)) s = "NO";
            if (b2 == c2 && (a1 == b1 || a1 == c1)) s = "NO";
            System.out.println(s);
        }
    }
}
