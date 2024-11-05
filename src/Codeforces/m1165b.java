package Codeforces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class m1165b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int k = 1;
        for (int i = 0; i < n; i++){
            if (arr[i]>=k){
                k++;
            }
        }
        System.out.println(k-1);
    }
}
