package Codeforces;

import java.util.Scanner;

public class m421a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < a; i++) arr[sc.nextInt() - 1] = 1;
        for (int i = 0; i < b; i++) arr[sc.nextInt() - 1] = 2;
        for (int i : arr) System.out.print(i + " ");
    }
}
