package Codeforces;

import java.util.Scanner;

public class m1945c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String p = sc.next(), s = p;
            int k1 = s.replace("0", "").length();
            int l = 0, k = 0;
            int min = n, r = n;
            for (int i = 0; i < s.length(); i++) {
                if ((k1 - k) >= ((n - i) % 2) + ((n - i) / 2) && l >= (i / 2 + i % 2)) {
                    if (min > Math.abs(n / 2 - i)) {
                        r = i;
                        min = Math.abs(n / 2 + n % 2 - i);
                    }
                }
                if (s.charAt(i) == '1') k++;
                else l++;

            }
            System.out.println(r);
        }
    }
}
