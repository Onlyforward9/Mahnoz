package Codeforces;

import java.util.Scanner;

public class m1371c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong(), b = sc.nextLong(), n = sc.nextLong(), m = sc.nextLong();
            if (a == b) System.out.println(a + b >= n + m ? "Yes" : "No");
            else {
            }
        }
    }
}
//10 5 6 8
//6 5-2 8
//6 0-2 3
//4 0-0 3