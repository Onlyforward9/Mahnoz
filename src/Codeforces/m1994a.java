package Codeforces;

import java.util.Scanner;

public class m1994a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int a = sc.nextInt();
                    if (a == 1) sb.append((n * m) + " ");
                    else sb.append((a - 1) + " ");
                }
                sb.append("\n");
            }
            System.out.println((n * m) == 1 ? -1 : sb);
        }
    }
}
