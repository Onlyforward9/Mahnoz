package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m1559d1 {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m1 = sc.nextInt(), m2 = sc.nextInt(), k = 0;
        HashSet<Integer>[] arr1 = new HashSet[n + 1], arr2 = new HashSet[n + 1];
        for (int i = 1; i <= n; i++) {arr1[i] = new HashSet<>();arr2[i] = new HashSet<>();}
        while (m1-- > 0) {int a = sc.nextInt(), b = sc.nextInt();arr1[a].add(b);arr1[b].add(a);}
        while (m2-- > 0) {int a = sc.nextInt(), b = sc.nextInt();arr2[a].add(b);arr2[b].add(a);}
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int[] visit1 = new int[n + 1];
                int[] visit2 = new int[n + 1];
                if (arr1[i].contains(j) || arr1[j].contains(i) || arr2[i].contains(j) || arr2[j].contains(i)) ;
                else {
                    arr1[i].add(j);arr1[j].add(i);arr2[i].add(j);arr2[j].add(i);
                    if (solve(arr1, visit1, i, i) || solve(arr2, visit2, i, i)) {
                        arr1[i].remove(j);arr1[j].remove(i);arr2[i].remove(j);arr2[j].remove(i);
                    } else {sb.append(i + " " + j + "\n");k++;}
                }
            }
        }
        System.out.println(k + "\n" + sb);
    }

    public static boolean solve(HashSet<Integer>[] arr, int[] visit, int c, int from) {
        visit[c] = 1;
        for (int val : arr[c]) {
            if (val == from) ;
            else if (visit[val] == 0 && solve(arr, visit, val, c)) return true;
            else if (visit[val] == 1) return true;
        }
        visit[c] = 2;
        return false;
    }
}
