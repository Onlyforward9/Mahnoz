package Codeforces;

import java.util.Scanner;

public class m30a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), x = sc.nextLong();
        int k = 1;
        if (a==0 && b==0) System.out.println(1);
        else if (a==0 || b % a != 0) System.out.println("No solution");
        else {
            int p = 10000;
            long m = b / a;
            while ((long) Math.pow(k, x) != m && (long) Math.pow(k, x) <= 1000) k++;
            if ((long) Math.pow(k, x) == m) p = k;
            k = 0;
            while ((long) Math.pow(k, x) != m && (long) Math.pow(k, x) >= -1000 && Math.pow(k, x) <=1000)k--;
            if ((long) Math.pow(k, x) == m) p = k;
            System.out.println(p == 10000 ? "No solution" : p);
        }
    }
}
