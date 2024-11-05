package Codeforces;

import java.util.Scanner;

public class m1954c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next(), b = sc.next();
            String aa = "", bb = "";
            int i = 0;
            while (i < a.length() && a.charAt(i) == b.charAt(i)) {
                aa += a.charAt(i) + "";
                bb += b.charAt(i) + "";
                i++;
            }
            if (a.length() != aa.length()) {
                aa += Math.max(a.charAt(i) - '0', b.charAt(i) - '0') + "";
                bb += Math.min(a.charAt(i) - '0', b.charAt(i) - '0') + "";
                i++;
                for (; i < a.length(); i++) {
                    aa += Math.min(a.charAt(i) - '0', b.charAt(i) - '0') + "";
                    bb += Math.max(a.charAt(i) - '0', b.charAt(i) - '0') + "";
                }
            }
            System.out.println(aa);
            System.out.println(bb);
        }
    }
}
