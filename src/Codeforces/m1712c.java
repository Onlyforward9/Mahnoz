package Codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class m1712c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int i = arr.length - 2;
            int e = arr[i + 1];
            while (i >= 0 && arr[i] <= e) {
                e = arr[i];
                i--;
            }
            if (i == -1) System.out.println(0);
            else {
                HashSet<Integer> set = new HashSet<>();
                for (int j = 0; j <= i; j++) set.add(arr[j]);
                int j=arr.length-1;
                for (;j > i; j--) {
                    if (set.contains(arr[j]))break;
                }
                for (int l=i+1;l<=j;l++)set.add(arr[l]);
                System.out.println(set.size());
            }
        }
    }
}
