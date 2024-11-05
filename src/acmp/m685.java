package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m685 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        for (int i = 0; i < b.length; i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        long s = 0;
        for (int i = 0; i < 3; i++) s += ((long) a[i] * b[i]);
        System.out.println(s);
    }
}
