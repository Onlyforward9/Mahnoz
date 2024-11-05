package Codeforces;

import java.util.*;

public class m161a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        int[] arr = new int[(int) n], a = new int[(int) n];
        for (int i = 0; i < n; i++) a[i] = arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int[] num = new int[(int) m];
        HashMap<Integer, TreeSet<Integer>> list = new HashMap<>();
        for (int i = 0; i < m; i++) {
            num[i] = sc.nextInt();
            if (!list.containsKey(num[i])) list.put(num[i], new TreeSet<>());
            list.get(num[i]).add(i + 1);
        }
        Arrays.sort(num);
        StringBuilder sb = new StringBuilder();
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            for (; j < m && num[j] <= arr[i] + y; j++) {
                if (num[j] >= arr[i] - x) {
                    if (!map.containsKey(arr[i])) map.put(arr[i], new PriorityQueue<>());
                    map.get(arr[i]).add(num[j]);
                    j++;
                    k++;
                    break;
                }
            }
        }
        System.out.println(k);
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                int p = map.get(a[i]).poll();
                int in = list.get(p).pollFirst();
                if (map.get(a[i]).isEmpty()) map.remove(a[i]);
                if (list.get(p).isEmpty()) list.remove(p);
                sb.append((i + 1) + " " + in + "\n");
            }
        }
        System.out.println(sb);
    }
}
