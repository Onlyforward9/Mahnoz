package Codeforces;

import java.util.Scanner;

public class m1975a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(),k=0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            for (int i = 1; i < n; i++) if (arr[i] < arr[i - 1]) k++;
            if (k > 1) System.out.println("No");
            else System.out.println(k == 1 ? (arr[n - 1] <= arr[0] ? "Yes" : "No") : "Yes");
        }
    }
}
