package Codeforces;

import java.util.Scanner;

public class m64a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), s = 1;
        for (int i = 1; i <= n; i++) s *= i;
        System.out.println(s);
    }
}
