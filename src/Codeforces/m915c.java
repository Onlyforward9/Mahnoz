package Codeforces;

import java.util.Scanner;

public class m915c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next(), res = "";
        int[] num = new int[10];
        for (int i = 0; i < a.length(); i++) num[a.charAt(i) - '0']++;
        int l = -1, m = 0;
        if (a.length() == b.length()) {
            while (res.length() != a.length()) {
                int i = 9;
                for (; i >= 0; i--) if (num[i] != 0 && i <= b.charAt(m) - '0') break;
                if (i >= 0) {
                    if (i != b.charAt(m) - '0') l = 1;
                    res += i + "";
                    num[i]--;
                    m++;
                    if (l == 1) {
                        for (int j = 9; j >= 0; j--) while (num[j]-- > 0) res += j + "";
                        break;
                    }
                } else {
                    int ch = 0, r = -1;
                    while (r == -1) {
                        ch = res.charAt(res.length() - 1) - '0';
                        res = res.substring(0, res.length() - 1);
                        num[ch]++;
                        for (int j = 9; j >= 0; j--)
                            if (num[j] != 0 && j < ch) {
                                r = j;
                                break;
                            }
                        if (r != -1) {
                            res += r + "";
                            num[r]--;
                            for (int j = 9; j >= 0; j--) while (num[j]-- > 0) res += j + "";
                        }
                    }
                }
            }
        } else for (int j = 9; j >= 0; j--) while (num[j]-- > 0) res += j + "";
        System.out.println(res);
    }
}
