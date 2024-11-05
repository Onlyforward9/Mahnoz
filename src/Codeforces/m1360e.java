package Codeforces;

import java.util.Scanner;

public class m1360e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            String res = "YES";
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n-1; j++) {
                    if (arr[i].charAt(j)=='1' && arr[i+1].charAt(j)=='0' && arr[i].charAt(j+1)=='0'){
                        res="NO";
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
