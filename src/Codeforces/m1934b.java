package Codeforces;

import java.util.Scanner;

public class m1934b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = {0, 1, 2, 1, 2, 3, 1, 2, 3, 2, 1, 2, 2, 2, 3, 1, 2, 3, 2, 3, 2, 2, 3, 3, 3, 2, 3, 3, 3, 4, 2};
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n / 15 <= 1) System.out.println(arr[n]);
            else System.out.println((n / 15 - 1) + (arr[n % 15 + 15]));
        }
    }
}
//1 3 6 10 15
//1-1
//2-1,1
//3-3
//4-1,3
//5-3,1,1
//6-6
//7-6 1
//8-6 1 1
//9-6 3
//10-10
//11 -10 1
//12-6 6
//13





