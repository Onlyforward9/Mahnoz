package Codeforces;

import java.util.Scanner;

public class m3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next(), c = sc.next();
        String s1 = a.charAt(0) + "" + b.charAt(0) + "" + c.charAt(0) + "";
        String s2 = a.charAt(1) + "" + b.charAt(1) + "" + c.charAt(1) + "";
        String s3 = a.charAt(2) + "" + b.charAt(2) + "" + c.charAt(2) + "";
        String m1 = a.charAt(0) + "" + b.charAt(1) + "" + c.charAt(2) + "";
        String m2 = a.charAt(2) + "" + b.charAt(1) + "" + c.charAt(0) + "";
        int x = 0, o = 0;
        String p = a + b + c;
        for (int i = 0; i < p.length(); i++)
            if (p.charAt(i) == 'X') x++;
            else if (p.charAt(i) == '0') o++;
        String l = "XXX", k = "000";
        if (a.equals(l) || b.equals(l) || c.equals(l) || m1.equals(l) ||
                s1.equals(l) || s2.equals(l) || s3.equals(l) || m2.equals(l)) {
            if (o + 1 == x) System.out.println("the first player won");
            else System.out.println("illegal");
        } else if (a.equals(k) || b.equals(k) || c.equals(k) || m1.equals(k) ||
                s1.equals(k) || s2.equals(k) || s3.equals(k) || m2.equals(k)) {
            if (o == x) System.out.println("the second player won");
            else System.out.println("illegal");
        } else if (x == 5 && o == 4) System.out.println("draw");
        else if (x - 1 == o) System.out.println("second");
        else if (x == o) System.out.println("first");
        else System.out.println("illegal");

    }
}
