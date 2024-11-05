package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m1436b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((n % 2 == 1 && i + 1 == ((n + 1) / 2)) && (j == 0 || j == n - 1)) sb.append("1 ");
                    else if (n % 2 == 1 && Math.abs(i + 1 - ((n + 1) / 2)) == 1 && j == n / 2)sb.append("1 ");
                    else if (i == j || i + j + 2 == n + 1) sb.append("1 ");
                    else sb.append("0 ");
                }
                sb.append("\n");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
// 1 0 0 0
// 0 1 0 0
//
//