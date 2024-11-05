package acmp;

import java.util.Scanner;

public class m93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        int m = sc.nextInt();
        while (m-- > 0) {
            String s = sc.next();
            for (int i = 0; i < n; i++) {
                String f = arr[i];
                int k = 0;
                for (int j = 0; j < f.length() && f.length() == s.length(); j++) {
                    if (s.charAt(j) != f.charAt(j)) k++;
                }
                if (k == 1) count[i]++;
            }
        }
        for (int i : count) System.out.print(i + " ");
    }
}
