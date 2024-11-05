package Codeforces;

import java.util.Scanner;

public class m1375c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int m = 0;
            for (int i = 1; i < n; i++) m = sc.nextInt();
            System.out.println(l > m ? "NO" : "YES");
        }
    }
}
//3 1 4 2
//2 4 1 3
//4 3 1 2 5 6