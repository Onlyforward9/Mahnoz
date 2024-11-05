package Codeforces;

import java.util.Scanner;

public class m1692a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), k = 0;
            for (int i = 0; i < 3; i++) k += sc.nextInt() > a ? 1 : 0;
            System.out.println(k);
        }
    }
}
