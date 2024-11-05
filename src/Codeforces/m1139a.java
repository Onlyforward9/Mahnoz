package Codeforces;

import java.util.Scanner;

public class m1139a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        long k = 0;
        String l = "2468";
        for (int i = 0; i < s.length(); i++) {
            if (l.contains(s.substring(i, i + 1))) {
                k += i + 1;
            }
        }
        System.out.println(k);
    }
}
