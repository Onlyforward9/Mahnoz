package Codeforces;

import java.util.Scanner;

public class m1363b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int[] k1 = new int[s.length() + 1];
            int[] k0 = new int[s.length() + 1];
            for (int i = 0; i < s.length(); i++) {
                k1[i + 1] = k1[i];
                k0[i + 1] = k0[i];
                if (s.charAt(i) == '1') k1[i + 1]++;
                else k0[i + 1]++;
            }
            int min = s.length();
            for (int i = 0; i < s.length(); i++) {
                int a=k1[i]+k0[s.length()]-k0[i];
                int b=k0[i]+k1[s.length()]-k1[i];
                min=Math.min(a,min);
                min=Math.min(b,min);
            }
            System.out.println(min);
        }
    }
}
