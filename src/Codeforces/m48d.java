package Codeforces;

import java.util.*;

public class m48d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0, l = 1, r = 0;
        HashMap<Integer, TreeSet<Integer>> map = new HashMap<>();
        Integer[] arr = new Integer[n];
        Integer[] num = new Integer[n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            if (!map.containsKey(a)) map.put(a, new TreeSet<>());
            map.get(a).add(i);
        }
        int p = n, max = 0;
        Arrays.sort(arr);
        for (int j : arr) {
            if (j == l) {
                k++;
                if (k > p) break;
                max = Math.max(max, k);
            } else if (j == l + 1 && k > 0) {
                p = k;
                k = 1;
                l++;
            } else break;
            if (!map.get(j).isEmpty()) {
                num[map.get(j).pollFirst()] = k;
                r++;
            } else break;
        }
        if (r != n) sb = new StringBuilder("-1");
        else for (int i : num) sb.append(i + " ");
        System.out.println(r != n ? sb : max + "\n" + sb);
    }
}
