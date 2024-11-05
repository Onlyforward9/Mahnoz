package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        for (int i = 0; i < n; i++) {
            arr[sc.nextInt()]++;
        }
        int max = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                j = i;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2] == arr[arr.length - 1] ? 0 : j);
    }
}
