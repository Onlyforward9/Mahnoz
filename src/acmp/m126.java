package acmp;

import java.util.Scanner;

public class m126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) for (int j = 1; j <= n; j++) arr[i][j] = sc.nextInt();
        long min = Integer.MAX_VALUE;
        for (int a = 1; a <= n; a++)
            for (int b = a + 1; b <= n; b++)
                for (int c = b + 1; c <= n; c++) min = Math.min(min, arr[a][b] + arr[b][c] + arr[c][a]);
        System.out.println(min);
    }
}

