package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m127a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        for (int i = 0; i < n; i++) arr[sc.nextInt()]++;
        int k = 0;
        Arrays.sort(arr);
        int i = 100;
        while (arr[i] != 0) {
            k += arr[i] / 2;
            i--;
        }
        System.out.println(k / 2);
    }
}
