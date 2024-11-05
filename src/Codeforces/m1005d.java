package Codeforces;

import java.util.Scanner;

public class m1005d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            int b = -1, c = -1;
            if (i + 1 < s.length()) b = s.charAt(i + 1) - '0';
            if (i + 2 < s.length()) c = s.charAt(i + 2) - '0';
            if (a % 3 == 0) {
                k++;
            } else if (b != -1 && (b % 3 == 0 || (a + b) % 3 == 0)) {
                k++;
                i++;
            } else if (c != -1 && (c % 3 == 0 || (b + c) % 3 == 0 || (a + b + c) % 3 == 0)) {
                k++;
                i += 2;
            }
        }
        System.out.println(k);
    }
}
