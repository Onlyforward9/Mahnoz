package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < (n + 2) / 2; i++) k += (arr[i] + 2) / 2;
        System.out.println(k);
    }
}
