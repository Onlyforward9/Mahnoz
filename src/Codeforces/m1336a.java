package Codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class m1336a {
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    static int n;
    static int depth[];
    static int size[];
    static ArrayList<Integer>[] list;

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        list = new ArrayList[n + 1];
        size = new int[n + 1];
        depth = new int[n + 1];
        int k = sc.nextInt();

        int i;
        int vis[] = new int[n + 1];
        for (i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (vis[x] == 0) {
                vis[x] = 1;
                list[x] = new ArrayList<>();
            }
            if (vis[y] == 0) {
                vis[y] = 1;
                list[y] = new ArrayList<>();
            }
            list[x].add(y);
            list[y].add(x);

        }
        sol(1, 0);
        i = 1;
        long ans = 0;
        while (i <= n - k) {
            ans += (long) pq.poll();
            i++;
        }
        System.out.println(ans);
    }

    static int sol(int c, int p) {
        depth[c] = depth[p] + 1;
        size[c] = 1;
        for (int i = 0; i < list[c].size(); i++) {
            int v = list[c].get(i);
            if (v == p)
                continue;
            size[c] += sol(v, c);
        }
        pq.add(size[c] - depth[c]);
        return size[c];
    }
}
