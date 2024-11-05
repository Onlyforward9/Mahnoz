package Codeforces;

import java.util.Scanner;

public class m1979d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next() + " ";
            int p = 0, l = 0, res = 0, i = 0;
            for (; i < s.length() - 1; i++) {
                if (s.charAt(i) != s.charAt(i + 1)) {
                    int m = i - l + 1;
                    if (m != k) {
                        res = m;
                        break;
                    }
                    l = i + 1;
                }
            }
            if (res == 0) System.out.println(k);
            else {
                if (i == n) System.out.println(-1);
                else {
                    int j = n - 1;
                    while (j >= 0 && s.charAt(j) == s.charAt(n - 1)) j--;
                    if ((res + n - j - 1) == k && s.charAt(i) == s.charAt(n - 1)) System.out.println(i + 1);
                    else if (res % k == 0 && res / k == 2 && s.charAt(i) != s.charAt(n - 1)) System.out.println(i);
                    else if (((res + n - j - 1) % k == 0 && (res + n - j - 1) / k == 2 && s.charAt(i) == s.charAt(n - 1)))
                        System.out.println(i - (k - (n - j - 1)));
                    else System.out.println(-1);
                }
            }
        }
    }
}
