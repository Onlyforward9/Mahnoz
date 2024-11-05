package Codeforces;

import java.util.Scanner;

public class m71a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(s.length() > 10 ? s.charAt(0)+"" + (s.length() - 2) + "" + s.charAt(s.length() - 1) : s);
        }
    }
}
