package Codeforces;

import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class m1980c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            HashSet<Integer> list = new HashSet<>();
            HashMap<Integer, Integer> need = new HashMap<>();
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                if (p != a[i]) {
                    need.put(p, need.getOrDefault(p, 0) + 1);
                } else list.add(p);
            }
            int count = need.size();
            int m = sc.nextInt(), val = 0;
            for (int i = 0; i < m; i++) {
                val = sc.nextInt();
                if (need.containsKey(val)) {
                    int l = need.get(val);
                    need.put(val, l - 1);
                    if (l == 1) {
                        need.remove(val);
                        list.add(val);
                        count--;
                    }
                }
            }
            if (count == 0 && list.contains(val))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
