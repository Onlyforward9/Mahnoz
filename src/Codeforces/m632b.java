package Codeforces;

import java.util.Scanner;

public class m632b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] al = new long[n + 1];
        long[] bob = new long[n + 1];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            bob[i + 1] = bob[i];
            al[i + 1] = al[i];
            if (s.charAt(i) == 'A') al[i + 1] += arr[i];
            else bob[i + 1] += arr[i];
        }
        long max = 0;
        for (int i = 0; i < n; i++) {
            long a=al[i+1]+(bob[n]-bob[i+1]);
            long b=(al[n]-al[n-i-1])+bob[n-i-1];
            max=Math.max(max,Math.max(a,b));
        }
        System.out.println(Math.max(max,bob[n]));
    }
}
