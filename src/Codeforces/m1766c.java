package Codeforces;

import java.util.Scanner;

public class m1766c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            String[] arr = new String[2];
            arr[0] = a;
            arr[1] = b;
            int k = a.replace("W", "").length() + b.replace("W", "").length();
            int i = -1, j = -1;
            for (int in = 0; in < n; in++) {
                if (a.charAt(in) == 'B' || b.charAt(in) == 'B') {
                    if (a.charAt(in) == 'B') i = in;
                    if (b.charAt(in) == 'B') j = in;
                    break;
                }
            }
            boolean bol = false;
            if (i != -1 && solve(arr, i, 0, k)) bol = true;
            else if (j != -1 && solve(arr, j, 1, k)) bol = true;
            System.out.println(bol ? "YES" : "NO");
        }
    }

    public static boolean solve(String[] arr, int start, int st, int k) {
        int l=0;
        while (k-- > 1) {
            if (arr[1 - st].charAt(start) == 'B' && l==0) {
                st = 1 - st;
                l=1;
            }
            else if (start + 1 < arr[0].length() && arr[st].charAt(start + 1) == 'B') {
                start++;
                l=0;
            }
            else return false;
        }
        return true;
    }
}
