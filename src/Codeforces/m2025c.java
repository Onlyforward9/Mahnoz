package Codeforces;

import java.util.*;

public class m2025c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (!map.containsKey(a)) map.put(a, 1);
                else map.put(a, map.get(a) + 1);
                set.add(a);
            }
            int max = 0, sum = 0;
            for (int value : map.keySet()) {
                int st = value;
                for (int i : set) {
                    if (i - st <= 1 && i - value < k) {
                        st = i;
                        sum += map.get(i);
                    } else break;
                }
                max = Math.max(max, sum);
                sum -= set.pollFirst();
            }
            System.out.println(max);
        }
    }
}
