package Codeforces;

import java.util.Scanner;
import java.util.TreeMap;

public class m2009d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            TreeMap<Integer, Integer> a = new TreeMap<>();
            TreeMap<Integer, Integer> b = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt(), y = sc.nextInt();
                if (y == 1) a.put(x, 0);
                else b.put(x, 0);
            }
            int i = 1, k = 0;
            for (int o : a.keySet()) {
                a.put(o, i);
                if (b.containsKey(o)) k++;
                i++;
            }
            i = 1;
            for (int o : b.keySet()) {
                b.put(o, i);
                i++;
            }
            int lb = b.size(), la = a.size(), m = k;
            long s = 0;
            for (int se : b.keySet()) {
                if (a.containsKey(se)) {
                    s += lb - b.get(se);
                    s += la - a.get(se);
                    k--;
                }
                s += k;
                if (a.containsKey(se + 1) && b.containsKey(se + 2)) s += 1;
                if (a.containsKey(se - 1) && a.containsKey(se + 1)) s += 1;
            }
            for (int f : a.keySet()) {
                if (b.containsKey(f)) {
                    m--;
                }
                s += m;
            }
            System.out.println(s);
        }
    }
}
