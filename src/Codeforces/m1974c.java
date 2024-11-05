package Codeforces;

import java.util.*;

public class m1974c {
    static Map<String, Map<Integer, Integer>> map;
    static long k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
            k = 0;
            map = new HashMap<>();
            for (int i = 2; i < n; i++) {
                int c = sc.nextInt();
                String a1 = "x " + b + " " + c, b1 = a + " x " + c, c1 = a + " " + b + " x";
                func(a1, a);
                func(b1, b);
                func(c1, c);
                a = b;
                b = c;
            }
            System.out.println(k);
        }
    }

    public static void func(String s, int p) {
        if (map.containsKey(s)) {
            k += map.get(s).get(0);
            map.get(s).put(0, map.get(s).get(0) + 1);
            if (map.get(s).containsKey(p)) k -= map.get(s).get(p);
            else map.get(s).put(p, 0);
            map.get(s).put(p, map.get(s).get(p) + 1);
        } else {
            map.put(s, new HashMap<>());
            map.get(s).put(p, 1);
            map.get(s).put(0, 1);
        }
    }
}