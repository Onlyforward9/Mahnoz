package Codeforces;

import java.util.Scanner;

public class m2033b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), res = 0;
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] < 0) {
                        int min = 0, p = i;
                        for (int l = j; l < n && p < n; l++) {
                            if (arr[p][l] < 0) min = Math.min(min, arr[p][l]);
                            arr[p][l] = 0;
                            p++;
                        }
                        res += min * -1;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
