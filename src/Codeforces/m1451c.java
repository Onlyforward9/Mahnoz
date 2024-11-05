package Codeforces;

import java.util.Scanner;

public class m1451c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String al = "abcdefghijklmnopqrstuvwxyz";
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[26];
            int[] b = new int[26];
            String aa = sc.next(), bb = sc.next();
            for (int i = 0; i < aa.length(); i++) a[al.indexOf(aa.charAt(i) + "")]++;
            for (int i = 0; i < aa.length(); i++) b[al.indexOf(bb.charAt(i) + "")]++;
            for (int i = 0; i < 26; i++) a[i] -= b[i];
            String res = "Yes";
            for (int i = 0; i < 26; i++) {
                if (a[i] < 0) {
                    for (int j = i; j >= 0; j--) {
                        if (a[j] > a[i] * -1 && a[j] >= k) {
                            a[i]=
                            a[j] -= k;
                        }
                    }
                    if (a[i] != 0) {
                        res = "NO";
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
//aaabba
//ddddcc
//a-4 b-2
//d-4 c-2
