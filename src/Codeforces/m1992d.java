package Codeforces;

import java.util.Scanner;

public class m1992d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            String s = "L" + sc.next() + "L";
            n += 2;
            int i = 0;
            while (i < n - 1) {
                if (s.charAt(i) == 'L') {
                    int p = -1;
                    for (int j = i + 1; j < n && j <= i + m; j++) {
                        if (s.charAt(j) == 'L') {
                            i = j;
                            p = 1;
                            break;
                        }
                    }
                    if (p == -1) i += m;
                    if (s.charAt(i) == 'C') {
                        k = -1;
                        break;
                    }
                } else {
                    i += 1;
                    if (s.charAt(i) == 'C') {
                        k = -1;
                        break;
                    }
                    k--;
                }
            }
            System.out.println(k >= 0 ? "YES" : "NO");
        }
    }
}
