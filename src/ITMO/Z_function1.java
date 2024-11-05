package ITMO;

import java.util.Scanner;

public class Z_function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            for (int i = s.length(); i >= 0; i--) {
                if (solve(s.substring(0, i))) {
                    s = s.substring(0, i);
                    break;
                }
            }
            System.out.println(s.length());
        }
    }

    public static boolean solve(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}
