package acmp;

import java.util.Scanner;

public class m284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a - 1; j < b; j++) {
                sb.append(arr[j] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
