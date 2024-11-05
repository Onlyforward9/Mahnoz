package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1537c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), index = 0;
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            int min = arr[n - 1] - arr[0];
            for (int i = 0; i < n - 1; i++) {
                if (arr[i + 1] - arr[i] < min) {
                    min = arr[i + 1] - arr[i];
                    index = i;
                }
            }
            int i = index;
            sb.append(arr[i]+" ");
            index+=2;
            for (; index < n; index++) sb.append(arr[index] + " ");
            for (int j = 0; j < i; j++) sb.append(arr[j] + " ");
            System.out.println(sb+""+arr[i+1]);
        }
    }
}
