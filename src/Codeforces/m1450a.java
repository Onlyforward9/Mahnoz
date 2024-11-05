package Codeforces;

import java.util.Scanner;

public class m1450a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String a = "", b = "";
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != 't') b += s.substring(i, i + 1);
                else a += s.substring(i, i + 1);
            }
            System.out.println(b + a);
        }
    }
}
