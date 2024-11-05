package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m877b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) arr[i + 1] = arr[i] + (s.charAt(i) == 'a' ? 1 : 0);
        int min = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                int a = i + 1 - arr[i + 1], b = arr[j + 1] - arr[i + 1], c = s.length() - j - 1 - (arr[s.length()] - arr[j + 1]);
                min = Math.min(min, a + b + c);
                int p1 = a + arr[s.length()] - arr[i + 1], p2 = s.length() - arr[s.length()];
                min = Math.min(min, Math.min(p1, p2));
                min = Math.min(min, arr[j + 1] + c);
                min = Math.min(min, Math.min(arr[s.length()], p2));
            }
        }
        min = Math.min(min, Math.min(arr[s.length()], s.length() - arr[s.length()]));
        System.out.println(s.length() - min);
    }
}
