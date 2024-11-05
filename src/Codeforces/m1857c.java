package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class m1857c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[(n - 1) * n / 2 + 1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arr.length - 1; i++) arr[i] = sc.nextInt();
            arr[arr.length-1]=1000000001;
            Arrays.sort(arr);
            int k = 1;
            n -= 1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == arr[i + 1]) k++;
                else {
                    while (k - n >= 0 && n!=0) {
                        k -= n;
                        n--;
                        sb.append(arr[i]).append(" ");
                    }
                    k = 1;
                }
            }
            pw.println(sb+""+arr[arr.length-2]);
        }
        pw.close();
    }
}
