package Codeforces;

import java.util.Scanner;

public class m47a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "NO";
        for (int i = 1; i <= n; i++) {
            if (i * (i + 1) / 2 == n) {
                res = "YES";
                break;
            }
        }
        System.out.println(res);
    }
}
