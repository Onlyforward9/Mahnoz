package Codeforces;

import java.util.Scanner;

public class m1189a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k_1 = s.length() - s.replace("1", "").length();
        int k_0 = n - k_1;
        if (k_1 == k_0) System.out.println("2\n" + (s.substring(0, n - 1)) + " " + s.charAt(n - 1));
        else System.out.println("1\n"+s);
    }
}
// 2 5 7 12