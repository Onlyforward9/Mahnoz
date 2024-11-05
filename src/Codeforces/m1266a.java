package Codeforces;

import java.util.Scanner;

public class m1266a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int sum = 0;
            boolean b = false;
            int k = 0;
            for (int i = 0; i < s.length(); i++) {
                int p = Integer.parseInt(s.substring(i, i + 1));
                sum += p;
                if (p % 2 == 0 && p != 0) b = true;
                if (p == 0) k++;
            }
            System.out.println(sum % 3 == 0 && ((b && k > 0) || k > 1) ? "red" : "cyan");
        }
    }
}

// 6 12 18 24 3 36 42 48 54 6 72 78  84 96 102 108 114 120 1260  1053