package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1007a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), j = 0, k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (; j < n && arr[j] == arr[i]; j++) ;
            if (j < n) {
                j++;
                k++;
            }
        }
        System.out.println(k);
    }
}
