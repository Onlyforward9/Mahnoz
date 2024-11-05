package Codeforces;

import java.util.Scanner;

public class m387b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), j = 0;
        int[] arr = new int[n], num = new int[m];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) num[i] = sc.nextInt();
        for (int k : arr) {
            for (; j < m && num[j] < k; j++) ;
            if (j < m){
                n--;
                j++;
            }
        }
        System.out.println(n);
    }
}
