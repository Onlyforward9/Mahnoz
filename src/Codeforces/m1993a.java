package Codeforces;

import java.util.Scanner;

public class m1993a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[4];
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') arr[0]++;
                if (s.charAt(i) == 'B') arr[1]++;
                if (s.charAt(i) == 'C') arr[2]++;
                if (s.charAt(i) == 'D') arr[3]++;
            }
            System.out.println(Math.min(arr[0], n) + Math.min(arr[1], n) + Math.min(arr[2], n) + Math.min(arr[3], n));
        }
    }
}
