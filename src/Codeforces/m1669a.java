package Codeforces;

import java.util.Scanner;

public class m1669a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "Division ";
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n >= 1900) System.out.println(s + "1");
            else if (n >= 1600) System.out.println(s + "2");
            else if (n >= 1400) System.out.println(s + "3");
            else System.out.println(s + "4");
        }
    }
}
