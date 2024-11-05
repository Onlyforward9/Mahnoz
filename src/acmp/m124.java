package acmp;

import java.util.Scanner;

public class m124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n + 1];
        while (m-- > 0) {
            arr[sc.nextInt()]++;
            arr[sc.nextInt()]++;
        }
        for (int i = 1; i <= n; i++) System.out.print(arr[i] + " ");
    }
}
