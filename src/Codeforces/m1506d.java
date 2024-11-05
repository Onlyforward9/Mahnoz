package Codeforces;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class m1506d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (!map.containsKey(a)) map.put(a, 0);
                map.put(a, map.get(a) + 1);
            }
            int max = Collections.max(map.values());
            System.out.println(n % 2 == 0 ? Math.max(2 * max - n, 0) : Math.max(2 * max - n, 1));
        }
    }
}
