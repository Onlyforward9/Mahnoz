package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m521 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1001];
        for (int i = 1; i <= 1000; i++) arr[i] = solve(i);
        System.out.println(Arrays.toString(arr));
    }

    public static int solve(int a) {
        int k = 0;
        while (a != 2) {
            if (a % 2 == 0) a /= 2;
            else a++;
            k++;
        }
        return k;
    }
}
