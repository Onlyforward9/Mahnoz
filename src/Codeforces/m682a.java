package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class m682a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long[] num1 = new long[n];
        long[] num2 = new long[n];
        long s =(num2[0]*num1[0])+(num2[1]*num1[4])+(num2[2]*num1[3])+(num2[3]*num1[2])+(num2[4]*num1[1]);
        System.out.println(s);
    }

    public static long[] solve(int n) {
        long[] arr = {n / 5, n / 5, n / 5, n / 5, n / 5};
        arr[1] += n % 5 >= 1 ? 1 : 0;
        arr[2] += n % 5 >= 2 ? 1 : 0;
        arr[3] += n % 5 >= 3 ? 1 : 0;
        arr[4] += n % 5 == 4 ? 1 : 0;
        return arr;
    }
}
