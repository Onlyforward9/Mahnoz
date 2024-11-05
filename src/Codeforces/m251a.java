package Codeforces;

import java.util.*;

public class m251a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), d = sc.nextInt();
        Map<Long, Integer> map = new HashMap<>();
        TreeSet<Long> set = new TreeSet<>();
        long[] arr = new long[(int) n];
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            map.put(a, i);
            set.add(a);
            arr[i] = a;
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            long in = map.get(set.floor(Math.min(arr[i] + d, arr[(int) (n - 1)]))) - i - 1;
            result += (in + 1) * in / 2;
        }
        System.out.println(result);
    }
}
