package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1826a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int k = 0;
            Arrays.sort(arr);
            int i = 0;
            while (arr[i] == 0) i++;
            int j = i;
            for (; i < n; i++) {
                if (arr[i] == arr[j]) k++;
                else break;
            }
            System.out.println(k == n ? arr[0] == 0 && arr[n - 1] == 0 ? 0 : -1 : n - k);
        }
    }
}
//2 3 7 8 9 11 14 15
//2 1 0 1 2  1  2 3
//0 1 1 2 2 4 7 8 9=-1
//1=-1
//0 2 3 3 4 5 8 8 =-1
//0 0 2 5 5
//