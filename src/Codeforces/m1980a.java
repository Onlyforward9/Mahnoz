package Codeforces;

import java.util.Scanner;

public class m1980a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String al = "ABCDEFG";
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[] arr = new int[7];
            String s = sc.next();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) arr[al.indexOf(s.charAt(i) + "")]++;
            for (int j : arr) sum += Math.max(0, m - j);
            System.out.println(sum);
        }
    }
}
