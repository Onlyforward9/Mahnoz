package acmp;

import java.util.Scanner;

public class m357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) a += Integer.parseInt(s.substring(i, i + 1));
            else b += Integer.parseInt(s.substring(i, i + 1));
        }
        int k = a - b;
        System.out.println(k % 11 == 0 ? "YES" : "NO");
    }
}

