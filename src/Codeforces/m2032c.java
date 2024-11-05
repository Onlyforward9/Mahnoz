package Codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class m2032c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            TreeSet<Integer> set = new TreeSet<>();
            TreeSet<Integer> list = new TreeSet<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if (!set.contains(arr[i])) {
                    map.put(arr[i], i);
                    set.add(arr[i]);
                }
            }
            int min = n;
            for (int i = n - 1; i >= 0; i--) {
                if (!list.contains(arr[i])) {
                    if (arr[0] + arr[1] > arr[i]) min = Math.min(min, n - i - 1);
                    else {
                        int m = arr[i] / 2 + 1;
                        int p = set.ceiling(m);
                        min = Math.min(min, n - i - 1 + map.get(p));
                        list.add(arr[i]);
                    }
                }
            }
            System.out.println(min);
        }
    }
}
