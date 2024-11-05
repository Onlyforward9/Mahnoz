package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class m86a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        String p = String.valueOf(r);
        if ((long) ((long) 5 * Math.pow(10, p.length() - 1)) < l || p.charAt(0) - '0' < 5)
            System.out.println(solve(r).max(solve(l)));
        else {
            long q = (long) ((long) 5 * Math.pow(10, p.length() - 1));
            System.out.println(solve(q));
        }
    }

    public static BigInteger solve(long r) {
        String s = "", ii = String.valueOf(r);
        for (int j = 0; j < ii.length(); j++) s += '9' - ii.charAt(j);
        return BigInteger.valueOf(r).multiply(BigInteger.valueOf(Long.parseLong(s)));
    }
}