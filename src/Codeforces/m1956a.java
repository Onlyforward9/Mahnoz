package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1956a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), q = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int min=arr[0];
            StringBuilder sb=new StringBuilder();
            while (q-->0){
                int ki=sc.nextInt();
                sb.append(Math.min(ki,min-1)+" ");
            }
            System.out.println(sb);
        }
    }
}
