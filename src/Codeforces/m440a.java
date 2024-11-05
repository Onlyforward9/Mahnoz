package Codeforces;

import java.util.Scanner;

public class m440a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i < n; i++) arr[sc.nextInt() - 1] = 1;
        for (int i = 0; i < n; i++) if (arr[i] ==0) System.out.println(i + 1);
    }
}
