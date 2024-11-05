package Codeforces;

import java.util.Scanner;

public class m1154c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt(), bb = sc.nextInt(), cc = sc.nextInt(), max = 0;
        char[] arr = {'a', 'b', 'c', 'a', 'c', 'b', 'a'};
        for (int i = 0; i < 7; i++) {
            int ka, kb, kc, j = i;
            int a = aa, b = bb, c = cc;
            for (; j < 7; j++) {
                if (arr[j] == 'a' && a > 0) a--;
                else if (arr[j] == 'b' && b > 0) b--;
                else if (arr[j] == 'c' && c > 0) c--;
                else break;
            }
            if (j != 7) max = Math.max(j - i, max);
            else {
                int jj = 0;
                int mi = Math.min(a / 3, Math.min(b / 2, c / 2));
                int res = 7 * mi + (7 - i);
                ka = a - mi * 3;
                kb = b - mi * 2;
                kc = c - mi * 2;
                for (; jj < 7; jj++) {
                    if (arr[jj] == 'a' && ka > 0) ka--;
                    else if (arr[jj] == 'b' && kb > 0) kb--;
                    else if (arr[jj] == 'c' && kc > 0) kc--;
                    else break;
                }
                res += jj;
                max = Math.max(max, res);
            }
        }
        System.out.println(max);
    }
}
