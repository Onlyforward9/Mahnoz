package Codeforces;

import java.util.Scanner;

public class m1820a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int res = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '_' && s.charAt(i + 1) == '_') {
                    res++;
                }
            }
            if (s.charAt(0) == '_') res++;
            if (s.charAt(s.length() - 1) == '_') res++;
            System.out.println(s.equals("^") ? 1 : res);
        }
    }
}
