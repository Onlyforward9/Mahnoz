package Codeforces;

import java.util.Scanner;

public class m318b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().replace("heavy", "1").replace("metal", "2");
        long k = s.length() - s.replace("2", "").length(), res = 0, i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '1') res += k;
            else if (s.charAt(j) == '2') k--;
        }
        System.out.println(res);
    }
}
