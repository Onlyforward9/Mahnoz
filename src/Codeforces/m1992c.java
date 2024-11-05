package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m1992c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = n; i >= k; i--) sb.append(i + " ");
            for (int i = m + 1; i < k; i++) sb.append(i + " ");
            for (int i = 1; i <= m; i++) sb.append(i + " ");
            System.out.println(sb);
        }
    }
}
