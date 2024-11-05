package Codeforces;

import java.util.Scanner;

public class m14a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) arr[i] = sc.next().toCharArray();
        int x_min = n, x_max = 0, y_min = m, y_max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '*') {
                    x_min = Math.min(x_min, i);
                    y_min = Math.min(y_min, j);
                    x_max = Math.max(x_max, i);
                    y_max = Math.max(y_max, j);
                }
            }
        }
        for (int i=x_min;i<=x_max;i++){
            for (int j=y_min;j<=y_max;j++) System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
