package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1249a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            for (int i = 0; i < n - 1; i++) if (arr[i] + 1 == arr[i + 1]) k++;
            System.out.println(k == 0 ? 1 : 2);
        }
    }
}
