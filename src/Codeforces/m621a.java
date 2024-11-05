package Codeforces;

import java.util.Scanner;

public class m621a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 == 1) min = Math.min(min, a);
            s += a;
        }
        System.out.println(s % 2 == 0 ? s : s - min);
    }
}
