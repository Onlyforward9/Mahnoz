package Codeforces;

import java.util.Scanner;

public class m1250f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 1;
        for (int i = 1; i * i <= n; i++) if (n % i == 0) max = i;
        System.out.println(max * 2 + (n / max) * 2);
    }
}
