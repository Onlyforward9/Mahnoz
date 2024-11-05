package Codeforces;

import java.util.Scanner;

public class m172a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        for (int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);
            boolean b = true;
            for (int j = 0; j < n; j++) {
                if (arr[j].charAt(i) != ch) {
                    b = false;
                    break;
                }
            }
            if (b) k++;
            else break;
        }
        System.out.println(k);
    }
}
