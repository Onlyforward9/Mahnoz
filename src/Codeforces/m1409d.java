package Codeforces;

import java.util.Scanner;

public class m1409d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = "0" + sc.next();
            long a = Long.parseLong(s);
            int l = s.length();
            int sum = sc.nextInt();
            while (sum(s) > sum) {
                s = s.substring(0, sol(s));
                s = s.substring(0, s.length() - 1) + "" + (Integer.parseInt(s.substring(s.length() - 1)) + 1);
            }
            l -= s.length();
            if (s.charAt(0) == '0') l--;
            while (l-- > 0) s += "0";
            if (Long.parseLong(s) - a < 0) System.out.println(Long.parseLong(s + "0") - a);
            else System.out.println(Long.valueOf(s) - a);
        }
    }

    public static int sum(String s) {
        int k = 0;
        for (int i = 0; i < s.length(); i++) k += Integer.parseInt(s.substring(i, i + 1));
        return k;
    }

    public static int sol(String s) {
        int i = s.length() - 1;
        while (s.charAt(i) == '9') i--;
        return i + 1;
    }
}
//9