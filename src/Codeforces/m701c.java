package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class m701c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        HashMap<Character, TreeSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), new TreeSet<>());
            map.get(s.charAt(i)).add(i);
        }
        int min = n;
        for (int i = 0; i < n; i++) {
            int max = 0;
            boolean b = true;
            for (Map.Entry<Character, TreeSet<Integer>> entry : map.entrySet()) {
                if (!entry.getValue().isEmpty()) {
                    int p = entry.getValue().first();
                    if (p == i) entry.getValue().pollFirst();
                    max = Math.max(max, p);
                } else {
                    b = false;
                    break;
                }
            }
            min = b ? Math.min(min, max - i + 1) : min;
        }
        System.out.println(min);
    }
}
//AAABBCCccab