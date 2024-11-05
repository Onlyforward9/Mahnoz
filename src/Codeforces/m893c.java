package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m893c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] cost = new int[n + 1];
        int[] arr = new int[n + 1];
        TreeSet<Integer>[] num = new TreeSet[n + 1];
        for (int i = 0; i < n; i++) cost[i + 1] = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (arr[a] != 0 && arr[b] != 0) {
                if (arr[a] != arr[b]) {
                    int l;
                    if (num[arr[a]].size() >= num[arr[b]].size()) {
                        l = arr[b];
                        for (int p : num[arr[b]]) {
                            arr[p] = arr[a];
                            num[arr[a]].add(p);
                        }
                    } else {
                        l = arr[a];
                        for (int p : num[arr[a]]) {
                            arr[p] = arr[b];
                            num[arr[b]].add(p);
                        }
                    }
                    num[l] = null;
                }
            } else if (arr[a] != 0) {
                num[arr[a]].add(b);
                arr[b] = arr[a];
            } else if (arr[b] != 0) {
                num[arr[b]].add(a);
                arr[a] = arr[b];
            } else {
                num[a] = new TreeSet<>();
                num[a].add(b);
                num[a].add(a);
                arr[a] = a;
                arr[b] = a;
            }
        }
        long sum = 0;
        for (TreeSet<Integer> set : num) {
            if (set != null) {
                int min = Integer.MAX_VALUE;
                for (int i : set) {
                    min = Math.min(min, cost[i]);
                    cost[i] = 0;
                }
                sum += min;
            }
        }
        for (int i : cost) sum += i;
        System.out.println(sum);
    }
}