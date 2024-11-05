package Codeforces;

import java.util.Scanner;

public class m126b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        int[] arr = new int[n];
        for (int i = 1, j = 0; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) j = arr[j - 1];
            if (s.charAt(i) == s.charAt(j)) j++;
            arr[i] = j;
        }
        int max = 0;
        for (int i = 1; i < n - 1; i++) max = Math.max(max, arr[i]);
        int curr = arr[n - 1];
        while (curr > max) curr = arr[curr - 1];
        if (curr == 0) System.out.println("Just a legend");
        else System.out.println(s.substring(0, curr));
    }
}