package Codeforces;

import java.util.Scanner;

public class m376a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long a = 0, b = 0;
        int in = s.indexOf("^");
        for (int i = 0; i < in; i++) {
            if (s.charAt(i) != '=') a += (long) (in - i) * (s.charAt(i) - '0');
        }
        for (int i = in + 1; i < s.length(); i++) {
            if (s.charAt(i) != '=') b += (long) (i - in) * (s.charAt(i) - '0');
        }
        if (a < b) System.out.println("right");
        else if (b < a) System.out.println("left");
        else System.out.println("balance");
    }
}
