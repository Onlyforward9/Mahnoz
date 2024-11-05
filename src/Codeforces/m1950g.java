package Codeforces;

import java.util.*;

public class m1950g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[][] arr = new String[n][2];
            String[][] kol = new String[n][2];
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                kol[i][0] = arr[i][0] = sc.next();
                kol[i][1] = arr[i][1] = sc.next();
                if (!map.containsKey(arr[i][0]))
                    map.put(arr[i][0], map.size() + 1);
                if (!map.containsKey(arr[i][1]))
                    map.put(arr[i][1], map.size() + 1);
            }
            int max = 0;
            TreeSet<Integer>[] num = new TreeSet[map.size() + 1];
            int[] team = new int[map.size() + 1];
            for (int i = 0; i < n; i++) {
                int a = map.get(arr[i][0]), b = map.get(arr[i][1]);
                if (team[a] != 0 && team[b] != 0) {
                    if (team[a] != team[b]) {
                        int l;
                        l = team[b];
                        for (int p : num[team[b]]) {
                            team[p] = team[a];
                            num[team[a]].add(p);
                        }
                        num[l] = null;
                    }
                } else if (team[a] != 0) {
                    num[team[a]].add(b);
                    team[b] = team[a];
                } else if (team[b] != 0) {
                    num[team[b]].add(a);
                    team[a] = team[b];
                } else {
                    num[a] = new TreeSet<>();
                    num[a].add(b);
                    num[a].add(a);
                    team[a] = a;
                    team[b] = a;
                }
            }
            int in = 0, l = 0;
            for (TreeSet<Integer> integers : num) {
                if (integers != null && integers.size() > max) {
                    max = integers.size();
                    in = l;
                }
                l++;
            }
            max = 0;
            for (int i = 0; i < n; i++) {
                for (int j : num[in]) {
                    if (j == map.get(kol[i][0]) || j == map.get(kol[i][1])) {
                        max++;
                        break;
                    }
                }
            }
            System.out.println(n-max);
        }
    }
}
