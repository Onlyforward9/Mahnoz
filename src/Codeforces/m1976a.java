package Codeforces;

import java.util.Scanner;

public class m1976a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String al = "0123456789abcdefghijklmnopqrstuvwxyz";
            int st = al.indexOf(s.charAt(0) + "");
            boolean bol = true;
            for (int i = 1; i < s.length(); i++) {
                int in = al.indexOf(s.charAt(i) + "");
                if (st > in) {
                    bol = false;
                    break;
                }
                st = in;
            }
            System.out.println(bol ? "YES" : "NO");
        }
    }
}
