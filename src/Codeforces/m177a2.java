package Codeforces;

import java.util.Scanner;

public class m177a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j || i==n/2 || j==n/2 || i==(n-j-1))sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
