package Codeforces;

import java.util.Scanner;

public class m435a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = 0, l = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (l + a <= m) l += a;
            else {
                k++;
                l=a;
            }
        }
        System.out.println(k+1);
    }
}
