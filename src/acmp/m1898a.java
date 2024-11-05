package acmp;

import java.util.Scanner;

public class m1898a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            int k = 0;
            int j = -1;
            int p = s.indexOf("B") + 1;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == 'B') {
                    k++;
                    if (k > m) {
                        j = i + 1;
                        break;
                    }
                }
            }
            if (k == m) System.out.println("0");
            else {
                System.out.println(1);
                int l = s.lastIndexOf("B") + 1;
                k = m - k;
                if (j == -1) {
                    if (p > k) System.out.println(k + " B");
                    else {
                        k = k - (p == 0 ? 0 : p - 1);
                        int min = n;
                        for (int i = p; i < s.length(); i++)
                            if (s.charAt(i) == 'A') {
                                k--;
                                if (k == 0) {
                                    min = i + 1;
                                    break;
                                }
                            }
                        System.out.println(min + " B");
                    }
                } else {
                    System.out.println(j + " A");
                }
            }
        }
    }
}
