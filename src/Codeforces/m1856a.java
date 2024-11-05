package Codeforces;

import java.util.Scanner;

public class m1856a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int i=n-1;
            for (;i>=1;i--){
                if (arr[i]<arr[i-1])break;
            }
            i--;
            int max=0;
            for (;i>=0;i--){
                max=Math.max(max,arr[i]);
            }
            System.out.println(max);
        }
    }
}
