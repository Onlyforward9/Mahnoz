package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1975b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int a = 0, b = 1;
            while (b < n && arr[b] % arr[a] == 0) b++;
            int i = b;
            for (; i < n; i++) {
                if (arr[i] % arr[a] != 0 && arr[i] % arr[b] != 0) break;
            }
            System.out.println(i == n || i == b ? "Yes" : "No");
        }
    }
}
