package Codeforces;

import java.util.Scanner;

public class m595a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt(), b = sc.nextInt();
                if (a == 1 || b==1) k++;
            }
        }
        System.out.println(k);
    }
}
