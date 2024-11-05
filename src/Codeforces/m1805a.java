package Codeforces;

import java.util.Scanner;

public class m1805a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), x = -1;
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
            for (int i = 0; i <= 256; i++) {
                int l = arr[0] ^ i, j = 1;
                while (j < n){
                    l=l^(arr[j]^i);
                    j++;
                }
                if (l==0) {
                    x = i;
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
