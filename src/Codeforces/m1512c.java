package Codeforces;

import java.util.Scanner;

public class m1512c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            char[] arr = sc.next().toCharArray();
            int n = arr.length, l = 0;
            for (int i = 0; i < n; i++)
                if (arr[i] == '1') {
                    b--;
                    if (arr[n - i - 1] == '?'){
                        arr[n - i - 1] = '1';
                        if (i>n-i-1)b--;
                    }
                    else if (arr[n - i - 1] == '0') {l = -1;break;}
                } else if (arr[i] == '0') {
                    a--;
                    if (arr[n - i - 1] == '?') {
                        arr[n - i - 1] = '0';
                        if (i>n-i-1)a--;
                    }
                    else if (arr[n - i - 1] == '1') {l = -1;break;}
                }
            if (l == -1 || a < 0 || b < 0) System.out.println(-1);
            else {
                for (int i = 0; i < n; i++)
                    if (arr[i] == '?')
                        if (a > b) {
                            a -= 2;
                            arr[i] = '0';
                            arr[n - i - 1] = '0';
                            if (i == n - i - 1) a++;
                        } else {
                            b -= 2;
                            arr[i] = '1';
                            arr[n - i - 1] = '1';
                            if (i == n - i - 1) b++;
                        }
                StringBuilder sb = new StringBuilder();
                for (char ch : arr) sb.append(ch + "");
                System.out.println(a == 0 && b == 0 ? sb : -1);
            }
        }
    }
}
