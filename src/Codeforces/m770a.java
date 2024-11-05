package Codeforces;

import java.util.Scanner;

public class m770a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String al = "abcdefghijklmnopqrstuvwxyz";
        String res = "";
        while (res.length() < n) {
            for (int i = 0; i < m; i++) res += al.charAt(i) + "";
        }
        System.out.println(res.substring(0, n));
    }
}
