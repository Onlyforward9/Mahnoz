package Codeforces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class m1692e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), s = sc.nextInt();
            Integer[] arr = new Integer[n + 1];
            Arrays.fill(arr, 0);
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                arr[i] = arr[i - 1] + sc.nextInt();
                map.put(arr[i], i);
            }
            if (arr[n] < s) System.out.println(-1);
            else {
                int max = 0;
                for (int i = 1; i <= n; i++) {
                    int p = arr[i] + s - (arr[i] - arr[i - 1] == 0 ? 0 : 1);
                    if (map.containsKey(p)) {
                        int in = map.get(p);
                        max = Math.max(max, in - i + 1);
                    }
                }
                System.out.println(n - max);
            }
        }
    }
}
