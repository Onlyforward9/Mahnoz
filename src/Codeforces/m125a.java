package Codeforces;

import java.util.Scanner;

public class m125a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 3 == 2) n += 1;
        int p = n / 36;
        System.out.println(p + " " + (n % 36) / 3);
    }
}
