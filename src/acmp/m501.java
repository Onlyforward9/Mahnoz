package acmp;

import java.util.Scanner;

public class m501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[101][101];
        int x1 = 0, y1 = 0, y2 = 0, x2 = 0;
        for (int l = 0; l <= n; l++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            for (int i = Math.min(y1, y2); i < Math.max(y1, y2); i++) {
                for (int j = Math.min(x1, x2); j < Math.max(x1, x2); j++) {
                    arr[i][j]++;
                }
            }
        }
        long k = 0;
        for (int i = Math.min(y1, y2); i < Math.max(y1, y2); i++)
            for (int j = Math.min(x1, x2); j < Math.max(x1, x2); j++) k += Math.max(0, arr[i][j] - 1);
        System.out.println(k);

    }
}
