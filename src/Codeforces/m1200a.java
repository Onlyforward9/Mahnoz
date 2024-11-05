package Codeforces;

import java.util.Scanner;

public class m1200a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[10];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                int st = 0;
                while (st < 10 && arr[st] == 1) st++;
                arr[st] = 1;
            } else if (s.charAt(i) == 'R') {
                int nd = 9;
                while (nd > -1 && arr[nd] == 1) nd--;
                arr[nd] = 1;
            } else arr[s.charAt(i) - '0'] = 0;
        }
        for (int i:arr) System.out.print(i+"");
    }
}
