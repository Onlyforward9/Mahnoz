package Codeforces;

import java.util.Scanner;

public class m1899c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n], num = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                num[i + 1] = num[i] + arr[i];
            }
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n - 1 && arr[j] % 2 != arr[j + 1] % 2; j++){
                    
                }
            }
        }
    }
}
