package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1695c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] min = new int[n][m];
            int[][] max = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    min[i][j] = sc.nextInt();
                    max[i][j] = min[i][j];
                }
            }
            for (int i = 1; i < n; i++) {
                min[i][0] += min[i - 1][0];
                max[i][0] += max[i - 1][0];
            }
            for (int i = 1; i < m; i++) {
                min[0][i] += min[0][i - 1];
                max[0][i] += max[0][i - 1];

            }
            System.out.println(Arrays.deepToString(max));
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    max[i][j] += Math.max(max[i - 1][j], max[i][j - 1]);
                    min[i][j] += Math.min(min[i - 1][j], min[i][j - 1]);
                }
            }
            if (max[n - 1][m - 1] % 2 == 0 && min[n - 1][m - 1] <= 0 && max[n - 1][m - 1] >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
