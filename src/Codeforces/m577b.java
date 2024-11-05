package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m577b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int[] memo = new int[m];
        for (int i = 1; i <= n; i++) {
            int x = scan.nextInt();
            for (int j = 0; j < m; j++)
                if (memo[j] != 0 && memo[j] != i && memo[(j + x) % m] == 0) memo[(j + x) % m] = i;
            memo[x % m] = i;
            System.out.println(Arrays.toString(memo));
            if (memo[0] > 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
/// && memo[j] != i && memo[(j + x) % m] == 0