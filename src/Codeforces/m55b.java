package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m55b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        String s = sc.next() + sc.next() + sc.next();
        Arrays.sort(arr);
        int kz = s.replace("+", "").length();
        if (s.equals("**+")) {
            long a = arr[0] * arr[1] * arr[2] + arr[3];
            long b = arr[0] * arr[3] + (arr[1] * arr[2]);
            long c = arr[0] * arr[1] + (arr[2] * arr[3]);
            System.out.println(Math.min(a, Math.min(b, c)));
        } else if (s.equals("*+*")) {
            long a = (arr[0] * arr[1] + arr[3]) * arr[2];
            long b = (arr[1] * arr[2] + arr[3]) * arr[0];
            System.out.println(Math.min(a, b));
        } else if (s.equals("+**")) {
            long a = (arr[2] + arr[3]) * arr[0] * arr[1];
            long c = (arr[0] + arr[2]) * arr[1] * arr[3];
            long b = (arr[2] + arr[1]) * arr[0] * arr[3];
            System.out.println(Math.min(a, Math.min(b, c)));
        } else if (s.equals("***")) System.out.println(arr[0] * arr[1] * arr[2] * arr[3]);
        else if (s.equals("+++")) System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
        else if (s.equals("++*")) {
            long a = (arr[0] + arr[1] + arr[2]) * arr[3];
            long b = (arr[1] + arr[2] + arr[3]) * arr[0];
            long c = (arr[0] + arr[3] + arr[2]) * arr[1];
            System.out.println(Math.min(a, Math.min(b, c)));
        } else if (s.equals("+*+")) {
            long a = ((arr[0] + arr[1]) * arr[2]) + arr[3];
            long b = ((arr[2] + arr[1]) * arr[0]) + arr[3];
            long c = ((arr[0] + arr[2]) * arr[1]) + arr[3];
            long d=(arr[3]+arr[2])+(arr[0]*arr[1]);
            System.out.println(Math.min(a, Math.min(b,Math.min(c,d))));
        } else System.out.println(arr[0] * arr[1] + arr[2] + arr[3]);

    }
}
//1 2 3 4