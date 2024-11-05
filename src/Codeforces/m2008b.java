package Codeforces;

import java.util.Scanner;

public class m2008b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int i = 0;
            while (i < s.length() && s.charAt(i) == '1') i++;
            if (i == s.length()) System.out.println(n == 4 ? "Yes" : "No");
            else System.out.println((i - 1) == n / (i - 1)?"Yes":"No");
        }
    }
}
