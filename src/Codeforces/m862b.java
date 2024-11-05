package Codeforces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class m862b {
    static ArrayList<Integer>[] arr;
    static HashSet<Integer> set1, set2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        set1 = new HashSet<>();
        set2 = new HashSet<>();
        arr = new ArrayList[n];
        for (int i = 1; i <= n; i++) arr[i] = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }
        for (int i = 1; i <= n; i++) {
            for (int j : arr[i]) {

            }
        }
    }
}
