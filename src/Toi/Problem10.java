package Toi;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        int[] num = new int[k];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            num[0] += arr[i];
            Arrays.sort(num);
        }
        System.out.println(num[num.length - 1]);
    }
}
