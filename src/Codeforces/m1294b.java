package Codeforces;

import java.util.*;

public class m1294b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            TreeMap<Integer, TreeSet<Integer>> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (!map.containsKey(b)) map.put(b, new TreeSet<>());
                map.get(b).add(a);
            }
            int r = 0;
            int u = 0;
            int[][] arr = new int[n][2];
            int i = 0;
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer, TreeSet<Integer>> entry : map.entrySet()) {
                int k = entry.getKey();
                for (int value : entry.getValue()) {
                    arr[i][0] = value;
                    arr[i][1] = k;
                    i++;
                }
            }
            boolean b = true;
            for (i = 0; i < n; i++) {
                if (arr[i][0] < r) {
                    b = false;
                    break;
                }
                while (r < arr[i][0]) {
                    r++;
                    sb.append("R");
                }
                if (arr[i][1] < u) {
                    b = false;
                    break;
                }
                while (u < arr[i][1]) {
                    u++;
                    sb.append("U");
                }
            }
            System.out.println(b ? "YES\n" + sb : "NO");
        }
    }
}
