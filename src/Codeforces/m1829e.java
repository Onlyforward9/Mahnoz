package Codeforces;

import java.util.Scanner;

public class m1829e {
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) arr[i][j] = sc.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) max = Math.max(max, solve(i, j, arr));
            System.out.println(max);
        }
    }
    public static int solve(int i, int j, int[][] arr) {
        if (i < 0 || j < 0 || i == n || j == m || arr[i][j] == 0) return 0;
        int sum = arr[i][j];
        arr[i][j] = 0;
        sum += solve(i, j - 1, arr);
        sum += solve(i, j + 1, arr);
        sum += solve(i - 1, j, arr);
        sum += solve(i + 1, j, arr);
        return sum;
    }
}
