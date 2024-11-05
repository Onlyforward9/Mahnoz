package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1133c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int max = 0;
        int s = arr[0];
        int j=1;
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - s <=5) k++;
            else {
                max = Math.max(max, k);
                s = arr[j];
                j++;
            }
        }
        max = Math.max(max, k);
        System.out.println(max);
    }
}
