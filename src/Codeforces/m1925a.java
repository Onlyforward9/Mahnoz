package Codeforces;

import java.util.Scanner;

public class m1925a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = "abcdefghijklmnopqrstuvwxyz";
            String res = "";
            while (n-- > 0) res += s.substring(0, k);
            System.out.println(res);
        }
    }
}
