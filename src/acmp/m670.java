package acmp;

import java.util.Scanner;

public class m670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        for (int i = 1; i < 100000; i++) {
            int[] arr = new int[10];
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) arr[s.charAt(j) - '0']++;
            int j = 0;
            for (; j < 10; j++) if (arr[j] > 1) break;
            if (j == 10) k++;
            if (k == n) {
                System.out.println(i);
                break;
            }
        }
    }
}
