package Codeforces;

import java.util.Scanner;

public class m1182b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        char[][] arr = new char[n][m];
        int k = 0, l = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().toCharArray();
            for (int j = 0; j < m; j++) if (arr[i][j] == '*') l++;
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (arr[i][j] == '*' && arr[i][j + 1] == '*' && arr[i][j - 1] == '*' && arr[i + 1][j] == '*' && arr[i - 1][j] == '*') {
                    if (k == 1) {
                        System.out.println("NO");
                        return;
                    }
                    k++;
                    l--;
                    int z = i, x = j - 1;
                    while (x >= 0 && arr[z][x] == '*') {
                        x--;
                        l--;
                    }
                    x = j + 1;
                    while (x < m && arr[z][x] == '*') {
                        x++;
                        l--;
                    }
                    z = i - 1;
                    x = j;
                    while (z >= 0 && arr[z][x] == '*') {
                        l--;
                        z--;
                    }
                    z = i + 1;
                    while (z < n && arr[z][x] == '*') {
                        l--;
                        z++;
                    }
                    if (l != 0) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println(k == 1 ? "YES" : "NO");
    }
}
