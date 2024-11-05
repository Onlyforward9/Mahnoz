package Codeforces;

import java.util.Scanner;

public class m1163a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(m >= (n / 2) ? n - m : Math.max(m, 1));
    }
}
