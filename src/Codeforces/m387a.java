package Codeforces;

import java.util.Scanner;

public class m387a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int ah = Integer.parseInt(s.substring(0, 2));
        int am = Integer.parseInt(s.substring(3));
        int bh = Integer.parseInt(t.substring(0, 2));
        int bm = Integer.parseInt(t.substring(3));
        int rh = ah - bh;
        int rm = am - bm;
        if (rh < 0) rh += 24;
        if (rm < 0) {
            if (rh != 0) {
                rh -= 1;
            }else rh=23;
            rm += 60;
        }
        System.out.println((rh < 10 ? "0" + rh : rh) + ":" + (rm < 10 ? "0" + rm : rm));
    }
}
//05:30
//01:50
//04:-20