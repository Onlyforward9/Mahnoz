package Codeforces;

import java.util.Scanner;

public class m1151a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 26 * 5;
        String s = sc.next();
        String al = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < n - 3; i++) {
            int A = Math.min(al.lastIndexOf(s.charAt(i) + "") - 1, 27 - al.lastIndexOf(s.charAt(i) + ""));
            int C = Math.min(Math.abs(al.lastIndexOf(s.charAt(i + 1) + "") - 3), 29 - al.lastIndexOf(s.charAt(i + 1) + ""));
            int T = Math.min(Math.abs(al.lastIndexOf(s.charAt(i + 2) + "") - 20), 46 - al.lastIndexOf(s.charAt(i + 2) + ""));
            T = Math.min(T, al.indexOf(s.charAt(i + 2) + "") + 6);
            int G = Math.min(Math.abs(al.lastIndexOf(s.charAt(i + 3) + "") - 7), 33 - al.lastIndexOf(s.charAt(i + 3) + ""));
            k = Math.min(k, A + C + T + G);
        }
        System.out.println(k);
    }
}
//ACTG
//27+19=46