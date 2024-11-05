package Codeforces;

import java.util.Scanner;

public class m1971d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next(), r = " ";
            for (int i = 0; i < s.length(); i++) {
                if (!r.endsWith(s.charAt(i) + "")) r += s.charAt(i) + "";
            }
            if (r.charAt(0) == '0') r = s.substring(1);
            int k = r.length();
            if (r.contains("01")) k--;
            System.out.println(k-1);
        }
    }
}
//11111 000 1111 00 111 00    1010
//  1   0   1   0 1   0
//0 1 0