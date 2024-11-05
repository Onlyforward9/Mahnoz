package Codeforces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class m1726a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE, max = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
            }
            boolean bol = false;
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] == max) set1.add(i + 1);
                if (arr[i] == min) set2.add(n - i - 1);
            }
            for (int a : set1) {
                for (int b : set2)
                    if (a % b == 0 || b % a == 0) {
                        bol = true;
                        break;
                    }
            }
            if (arr[0] == min || arr[n - 1] == max || bol) System.out.println(max - min);
            else System.out.println(Math.max(max - arr[0], arr[n - 1] - min));
        }
    }
}
