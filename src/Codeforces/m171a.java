package Codeforces;

import java.util.Scanner;

public class m171a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(b));
        sb.reverse();
        System.out.println(a + Integer.parseInt("" + sb));
    }
}
