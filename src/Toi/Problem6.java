package Toi;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong(), a = 0;
        int p = 0;
        int k = 3;
        char ch = 0;
        while (a < s) {
            if (p % 2 == 0) {
                if (a + 4 < s) {
                    a += 4;
                    ch = 'm';
                } else {
                    if (a + 1 == s || a + 4 == s) ch = 'm';
                    else ch = 'o';
                    break;
                }
            } else {
                ch = 'o';
                if (a + k < s) {
                    a += k;
                } else break;
                k++;
            }
            p++;
        }
        System.out.println(ch);
    }
}
