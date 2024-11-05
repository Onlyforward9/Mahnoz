package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m300a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int k = 0;
        String  b = "", c = "";
        int i = 1;
        for (; i < arr.length; i++) {
            if (arr[i] < 0) {
                k++;
                b += (arr[i] + " ");
                if (k % 2 == 0) break;
            } else break;
        }
        int kb = 0, kc = 0;
        if (k==2) {
            i += 1;
            for (; i < arr.length; i++) {
                c += arr[i] + " ";
                kc++;
            }
            kb = 2;
        } else {
            b="";
            for (i = 1; i < arr.length - 1; i++) {
                c += arr[i] + " ";
                kc++;
            }
            kb = 1;
            b += arr[arr.length - 1];
        }
        System.out.println("1 "+arr[0]);
        System.out.println(kb+" "+b);
        System.out.println(kc+" "+c);
    }
}

