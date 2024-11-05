package Codeforces;

import java.util.Scanner;

public class m255a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a1 = 0, a2 = 0, a3 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) a1 += sc.nextInt();
            else if (i % 3 == 1) a2 += sc.nextInt();
            else a3 += sc.nextInt();
        }
        if (a1 > a2 && a1 > a3) System.out.println("chest");
        else if (a2 > a1 && a2 > a3) System.out.println("biceps");
        else System.out.println("back");
    }
}
