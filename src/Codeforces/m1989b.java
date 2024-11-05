package Codeforces;

import java.util.Scanner;

public class m1989b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String n = sc.next(), m = sc.next();
            int max = 0;
            for (int i = 0; i < m.length(); i++) {
                int l = i;
                for (int j = 0; j < n.length(); j++)
                    if (l < m.length() && n.charAt(j) == m.charAt(l)) l++;
                max = Math.max(max, l - i);
            }
            System.out.println(n.length() + m.length() - max);
        }
    }
}
//ba
//aba
//hklmjbgbhj
//jbhklm