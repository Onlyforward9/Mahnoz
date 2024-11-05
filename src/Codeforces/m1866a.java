package Codeforces;

import java.util.Scanner;

public class m1866a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 100001;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            min = Math.min(Math.abs(a), min);
        }
        System.out.println(min);
    }
}
