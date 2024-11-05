package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m913a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[30];
        for (int i = 1; i < 30; i++) arr[i] = (int) Math.pow(2, i);
        if (n <= 29) System.out.println(m % arr[n]);
        else System.out.println(m);
    }
}
