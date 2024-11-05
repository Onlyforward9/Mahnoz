package Codeforces;

import java.util.Scanner;

public class m1907c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String al = "abcdefghijklmnopqrstuvwxyz";
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[26];
            int max = 0;
            char r;
            for (int i = 0; i < s.length(); i++) {
                arr[al.indexOf(s.substring(i, i + 1))]++;
                if (arr[al.indexOf(s.substring(i, i + 1))] >= max)
                    max = arr[al.indexOf(s.substring(i, i + 1))];
            }
            System.out.println(s.length()%2==1?Math.max(1, 2 * max - n):Math.max(0, 2 * max - n));
        }
    }
}
