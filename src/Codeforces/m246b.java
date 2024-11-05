package Codeforces;

import java.util.Scanner;

public class m246b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        for (int i = 0; i < n; i++) s += sc.nextInt();
        System.out.println(s % n == 0 ? n : n - 1);
    }
}
