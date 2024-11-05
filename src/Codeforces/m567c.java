package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class m567c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long res = 0;
        Map<Long, Long> start = new HashMap<>();
        Map<Long, Long> end = new HashMap<>();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if (!end.containsKey(arr[i])) end.put(arr[i], 1L);
            else end.put(arr[i], end.get(arr[i]) + 1);
        }
        for (int i = 0; i < n; i++) {
            end.put(arr[i], end.get(arr[i]) - 1);
            if (arr[i] % k == 0 && start.containsKey(arr[i] / k) && end.containsKey(arr[i] * k))
                res += (start.get(arr[i] / k) * end.get(arr[i] * k));
            if (!start.containsKey(arr[i])) start.put(arr[i], 1L);
            else start.put(arr[i], start.get(arr[i]) + 1);
        }
        System.out.println(res);
    }
}
