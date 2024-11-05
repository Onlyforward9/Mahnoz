package Codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class m1692h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), max = 0,a=0;
            String res = "";
            HashMap<Integer, Integer> map = new HashMap<>();
            HashMap<Integer, Integer> index = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                a = sc.nextInt();
                if (!map.containsKey(a)) {
                    map.put(a, 1);
                    index.put(a, i);
                } else {
                    map.put(a, map.get(a) + 1);
                    int p = i - index.get(a) + 1 - (2 * (i - index.get(a) + 1 - map.get(a)));
                    if (max <= p) {
                        res = a + " " + index.get(a) + " " + i;
                        max = p;
                    }
                    if (p <= 0) {
                        index.put(a, i);
                        map.put(a,1);
                    }
                }
            }
            if (max==0) System.out.println(a+" "+n+" "+n);
            else System.out.println(res);
        }
    }
}
