package acmp;

import java.util.Scanner;

public class m125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) num[i] = sc.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) if (arr[i][j] == 1 && num[i] != num[j]) k++;
        System.out.println(k / 2);
    }
}
