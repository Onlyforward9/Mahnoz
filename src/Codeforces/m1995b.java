package Codeforces;

import com.sun.source.util.Trees;

import java.util.*;

public class m1995b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();
            TreeMap<Long, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                if (map.containsKey(a)) map.put(a, map.get(a) + 1);
                else map.put(a, 1);
            }
            long max = 0;
            for (long i : map.keySet()) {
                long f = i * map.get(i);
                if (map.containsKey(i + 1)) f += (i + 1) * map.get(i + 1);
                if (f > m) {
                    if (!map.containsKey(i + 1)) {
                        long p = f - m;
                        p = p % i == 0 ? p / i : p / i + 1;
                        f -= (p * i);
                    }else {
                        
                    }
                }
                max = Math.max(max, f);
            }
            System.out.println(max);
        }
    }
}
