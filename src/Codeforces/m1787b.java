package Codeforces;

import java.util.*;

public class m1787b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            int d = 2, l = 0;
            while (n != 1) {
                if (n % d == 0) {
                    map.put(d, map.getOrDefault(d, 0) + 1);
                    n /= d;
                } else {
                    if (d > Math.sqrt(n)) {
                        map.put(n, 1);
                        n = 1;
                    }
                    d++;
                }
            }
            int[][] arr = new int[map.size()][2];
            int i = 0, m = 1;
            for (int val : map.keySet()) {
                arr[i][0] = val;
                arr[i][1] = map.get(val);
                m *= val;
                i++;
            }
            Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
            int res = 0, s = 0;
            for (int j = 0; j < map.size(); j++) {
                res += (arr[j][1] - s) * m;
                s = arr[j][1];
                m /= arr[j][0];
            }
            System.out.println(res);
        }
    }
}
