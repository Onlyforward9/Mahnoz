package Codeforces;

import java.util.Scanner;

public class m1703a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(s.equalsIgnoreCase("yes") ? "YES" : "NO");
        }
    }
}
