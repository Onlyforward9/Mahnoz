package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1397b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = 0, l = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            s += a;
        }
        Arrays.sort(arr);
        s -= n;
        l=s;
        int p=-1;
        int c = 2,i=0;
        while (l<=s && (i==n || p==-1)){
            s=l;
            l = 0;
            i = 0;
            for (; i < n && l < s; i++) {
                if (Math.abs(arr[i] - ((long) Math.pow(c, i))) > s) break;
                else l += Math.abs(arr[i] - ((long) Math.pow(c, i)));
            }
            c++;
            p=1;
        }
        System.out.println(s);
    }
}
