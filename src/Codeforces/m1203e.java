package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m1203e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[] arr = new int[150002];
        for (int i = 0; i < n; i++) arr[sc.nextInt()]++;
        for (int i = 1; i <= 150000; i++)
            if (arr[i] > 1 && arr[i + 1] <= 1) {
                arr[i]--;
                arr[i + 1]++;
            }
        for (int i = 150000; i > 1; i--)
            if (arr[i] > 1 && arr[i - 1] <= 1) {
                arr[i]--;
                arr[i - 1]++;
            }
        for (int val : arr) if (val > 0) count++;
        System.out.println(count);
    }
}
