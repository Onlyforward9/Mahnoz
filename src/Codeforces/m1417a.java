package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1417a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), s = 0;
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for (int i = 1; i < n; i++) s += ((k - arr[i]) / arr[0]);
            System.out.println(s);
        }
    }
}
