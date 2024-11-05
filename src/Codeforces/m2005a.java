package Codeforces;

import java.util.Scanner;

public class m2005a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = "";
            int[] arr = new int[5];
            for (int i = 0; i < n; i++) arr[i % 5]++;
            for (int i=0;i<arr[0];i++)s+="a";
            for (int i=0;i<arr[1];i++)s+="e";
            for (int i=0;i<arr[2];i++)s+="i";
            for (int i=0;i<arr[3];i++)s+="o";
            for (int i=0;i<arr[4];i++)s+="u";
            System.out.println(s);
        }
    }
}
