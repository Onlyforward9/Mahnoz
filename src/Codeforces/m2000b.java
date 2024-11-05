package Codeforces;

import java.util.Scanner;

public class m2000b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            int b = 1;
            arr[sc.nextInt()] = 1;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                if (arr[a-1]==1 ||(a!=n && arr[a+1]==1))
                    arr[a]=1;
                else b=-1;
            }
            System.out.println(b==1?"YES":"NO");
        }
    }
}
