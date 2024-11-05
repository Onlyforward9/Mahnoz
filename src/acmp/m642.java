package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m642 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int i = 0;
        while (s - arr[i] >= 0) {
            s -= arr[i];
            i++;
        }
        System.out.println(i);
    }
}
