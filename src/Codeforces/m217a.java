package Codeforces;

import java.util.Scanner;

public class m217a {
    static Scanner in = new Scanner(System.in);
    static int[] x = new int[105], y = new int[105], vis = new int[105];
    static int n;

    public static void dfs(int i) {
        vis[i] = 1;
        for (int j = 1; j <= n; j++) {
            if ((x[j] == x[i] || y[j] == y[i]) && vis[j] == 0) {
                dfs(j);
            }
        }
    }

    public static void main(String[] args) {
        n = in.nextInt();
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                dfs(i);
                ans++;
            }
        }
        System.out.println(ans);
    }
}