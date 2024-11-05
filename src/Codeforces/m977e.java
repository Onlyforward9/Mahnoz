package Codeforces;

import java.util.*;

public class m977e {
    static int[] visit = new int[200005];
    static int n;
    public static void dfs(List<Integer>[] arr, int i, int comp) {
        visit[i] = comp;
        for (int ver : arr[i]) if (visit[ver] == 0) dfs(arr, ver, comp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer>[] arr = new List[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }
        int k = 0, comp = 1;
        for (int i = 1; i <= n; i++) {if (visit[i] == 0) {dfs(arr, i, comp);comp++;}}
        Set<Integer>[] set = new Set[comp];
        for (int i = 1; i < comp; i++) set[i] = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            set[visit[i]].add(i);
        }
        for (int i = 1; i < comp; i++) {
            boolean bol = true;
            for (int b : set[i]) {if (arr[b].size() != 2) {bol = false;break;}}
            if (bol) k++;
        }
        System.out.println(k);
    }
}
