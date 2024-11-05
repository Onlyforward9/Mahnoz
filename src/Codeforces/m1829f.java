package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class m1829f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                int v = sc.nextInt(), u = sc.nextInt();
                if (!map.containsKey(v)) map.put(v, new TreeSet<>());
                if (!map.containsKey(u)) map.put(u, new TreeSet<>());
                map.get(v).add(u);
                map.get(u).add(v);
            }
            int k = 0, res = 0;
            for (Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
                if (entry.getValue().size() == 1) k++;
            }
            for (int i = 1; i <= n; i++) {
                res = 0;
                for (Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
                    if (entry.getValue().size() != 1 && !entry.getValue().contains(i) && entry.getKey() != i) {
                        res = -1;
                        break;
                    }
                }
                if (res == 0) {
                    res = i;
                    break;
                }
            }
            System.out.println(map.get(res).size() + " " + (k / map.get(res).size()));
        }
    }
}
