package Codeforces;

import java.util.Scanner;

public class m2009b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "";
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                s = (str.indexOf("#") + 1) + " " + s;
            }
            System.out.println(s);
        }
    }
}