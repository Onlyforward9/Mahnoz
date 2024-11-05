package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m621b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = 0;
        int[][] arr = new int[1001][1001];
        int[][] num = new int[1001][1001];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt(), b = scanner.nextInt();
            arr[a][b] = 1;
            num[a][b] = 1;
        }
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j < 1001; j++) {
                if (arr[i][j] == 1) {
                    int p = i + 1, l = j + 1, u = 0;
                    while (p < 1001 && l < 1001) {
                        if (arr[p][l] == 1) u++;
                        arr[p][l] = 0;
                        p++;
                        l++;
                    }
                    k += (u * (u + 1) / 2);
                }
            }
        }
        for (int i = 1; i < 1001; i++) {
            for (int j = 1; j < 1001; j++) {
                if (num[i][j] == 1) {
                    int p = i + 1, l = j - 1, u = 0;
                    while (p < 1001 && l > 0) {
                        if (num[p][l] == 1) u++;
                        num[p][l] = 0;
                        p++;
                        l--;
                    }
                    k += (u * (u + 1) / 2);
                }
            }
        }
        System.out.println(k);
    }
}
