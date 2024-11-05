package Codeforces;

import java.util.Scanner;

public class m1204a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().substring(1);
        int m = s.length();
        if (!s.contains("1")) m--;
        System.out.println((m / 2 + (s.equals("") ?0:1)));
    }
}
