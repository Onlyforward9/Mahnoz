package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m316a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String num = "0123456789?";
        long p = 1;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!num.contains(s.charAt(i) + "")) set.add(s.charAt(i) + "");
            else if (s.charAt(i) == '?') p*=10;
        }
        long res = 1;
        for (int i = 0; i < set.size(); i++) res *= (10 - i);
        System.out.println(res * p + (num.contains(s.charAt(0) + "") ? 0 : -9));
    }
}
//ABC
//012 013 014 015 016 017 018 019
//021 023 024 025 026 027 028 029
//8*9*10
//AB
//01 02 03 04 05 06 07 08 09
//10 12 13 14 15 16 17 18 19
//20 21 23 24 25 26 27 28 29
//30 31 32 34 35 36 37 38 39
//40 41 42 43 45 46 47 48 49
//50 51 52 53 54 56 57 58 59
//6
//7
//8
//90 91 92 93 94 95 96 97 98