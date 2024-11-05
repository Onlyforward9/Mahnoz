package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m1741d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 1; (int) Math.pow(2, i) <= n; i++) set.add((int) Math.pow(2, i));
            int result = 0;
            boolean bol = true;
            for (int value : set) {
                for (int i = 0; i < n; i += value) {
                    TreeSet<Integer> set_ar = new TreeSet<>();
                    for (int j = i; j < i + value; j++) set_ar.add(arr[j]);
                    int j = i, l = 0, st = arr[i], start = set_ar.first();
                    for (int vl : set_ar) {
                        if (st > arr[j]) l++;
                        st = arr[j];
                        arr[j] = vl;
                        j++;
                        if (vl - start > 1) {
                            bol = false;
                            break;
                        }
                        start = vl;

                    }
                    result += l;
                    if (start - set_ar.first() != value - 1) {
                        bol = false;
                        break;
                    }
                }
            }
            System.out.println(bol ? result : -1);
        }
    }
}