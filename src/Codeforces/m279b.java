package Codeforces;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class m279b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0;
        Integer[] arr = new Integer[n + 1];
        arr[0] = 0;
        map.put(-1, -1);
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            s += a;
            set.add(s);
            map.put(s, i);
            arr[i + 1] = s;
        }
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            int p = t + arr[i - 1];
            Integer m2 = set.floor(p);
            int m = m2 != null ? Integer.parseInt(String.valueOf(m2)) : -1;
            int l = map.get(m);
            max = Math.max(max, l - i + 2);
        }
        System.out.println(max);
    }
}
