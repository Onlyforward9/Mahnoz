package Codeforces;

import java.util.Scanner;

public class m1692c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String[] arr = new String[8];
            for (int i = 0; i < 8; i++) arr[i] = sc.next();
            for (int i = 1; i < 7; i++) {
                for (int j = 1; j < 7; j++) {
                    if (arr[i].charAt(j) == '#' && arr[i - 1].charAt(j - 1) == '#' && arr[i - 1].charAt(j + 1) == '#' && arr[i + 1].charAt(j - 1) == '#' && arr[i + 1].charAt(j + 1) == '#') {
                        System.out.println((i + 1) + " " + (j + 1));
                        break;
                    }
                }
            }
        }
    }
}
