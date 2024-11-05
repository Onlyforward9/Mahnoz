package acmp;

import java.util.Scanner;

public class m149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) sb.append(arr[i] + " ");
        System.out.println(sb);
    }
}
