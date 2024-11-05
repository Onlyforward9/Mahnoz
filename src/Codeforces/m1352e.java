package Codeforces;

import java.util.*;

public class m1352e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            HashSet<Integer> set = new HashSet<>();
            int k = 0, s;
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                s = arr[i];
                for (int j = i + 1; s <= n && j < n; j++) {
                    set.add(s + arr[j]);
                    s += arr[j];
                }
            }
            for (int value : arr) if (set.contains(value)) k++;
            System.out.println(k);
        }
    }
}
