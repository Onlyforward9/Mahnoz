package Codeforces;

import java.util.Scanner;

public class m1943a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            int s = 0;
            int l = n - 1;
            while (l > 0 && k - l > 0) {
                k -= l;
                l--;
                s++;
            }
            System.out.println(n-s);
        }
    }
}
