package Codeforces;

import java.util.Scanner;

public class m1157a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = 0;
        for (int i = 1; i < s.length(); i++) {
            k += (9 - Integer.parseInt(s.substring(i, i + 1)));
        }
        System.out.println(s.length() == 1 ? 9 : 10 + k);
    }
}
