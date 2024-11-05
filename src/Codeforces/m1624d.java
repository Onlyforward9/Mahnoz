package Codeforces;

import java.util.Scanner;

public class m1624d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String al = "abcdefghijklmnopqrstuvwxyz";
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[26];
            for (int i = 0; i < s.length(); i++) arr[al.indexOf(s.charAt(i) + "")]++;
            int l = 0;
            for (int j : arr) {
                l += (j - j % 2);
            }
            if (l != n && (l / k) % 2 == 0 && k - (l % k) <= (n - l)) System.out.println(l / k + 1);
            else System.out.println(Math.max(l / k, 1));
        }
    }
}
