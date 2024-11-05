package Codeforces;

import java.util.Scanner;

public class m1823b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int k = 0;
            for (int i = 1; i <= n; i++) {
                int a = sc.nextInt();
                if ((a - i) % r != 0) k++;
            }
            System.out.println(k == 0 ? 0 : k == 2 ? 1 : -1);
        }
    }
}
//3 2
//1 3 2