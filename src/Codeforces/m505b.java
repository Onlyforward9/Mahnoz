package Codeforces;

import java.util.*;

public class m505b {
    static ArrayList<Integer>[] num;
    static int[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] arr = new int[m][3];
        for (int i = 0; i < m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[][] qq = new int[q][2];
        int[] res = new int[q];
        for (int i = 0; i < q; i++) {
            qq[i][0] = sc.nextInt();
            qq[i][1] = sc.nextInt();
        }
        for (int colour = 1; colour <= m; colour++) {
            num = new ArrayList[n + 1];
            visit = new int[n + 1];
            for (int i = 1; i <= n; i++) num[i] = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                if (arr[i][2] == colour) {
                    int aa = arr[i][0], bb = arr[i][1];
                    num[aa].add(bb);
                    num[bb].add(aa);
                }
            }
            int co = 1;
            for (int i = 1; i <= n; i++) {
                if (visit[i] == 0) {
                    dfs(i, co);
                    co++;
                }
            }
            for (int i = 0; i < q; i++) if (visit[qq[i][0]] == visit[qq[i][1]]) res[i]++;
        }
        for (int count : res) System.out.println(count);
    }

    public static void dfs(int aa, int co) {
        visit[aa] = co;
        for (int val : num[aa]) {
            if (visit[val] == 0) {
                dfs(val, co);
            }
        }
    }
}
