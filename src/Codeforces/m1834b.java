package Codeforces;

import java.util.Scanner;

public class m1834b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next(), b = sc.next();
            int k = Math.max(a.length(), b.length());
            int j = Math.min(a.length(), b.length());
            int s = 0;
            for (int i = 0; i < k - j; i++) s += (a.length() > b.length() ? a : b).charAt(i) - '0';
            int i = 0;
            while (i < j && a.charAt(i) == b.charAt(i)) i++;
            int p = i < j ? Math.abs((a.charAt(i) - '0') - (b.charAt(i) - '0')) : 0;
            i++;
            System.out.println(k == j ? Math.max(p + (9 * (j - i)), 0) : s + j * 9);
        }
    }
}
//533 578 = 500 - 569 = 69