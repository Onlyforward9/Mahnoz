package Codeforces;

import java.util.Scanner;

public class m576a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= 1000; i++) {
            int l = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    l = 0;
                    break;
                }
            }
            if (l == 1) {
                int p = 1;
                while ((int) Math.pow(i, p) <= n) {
                    arr[(int) Math.pow(i, p)] = 1;
                    p++;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=n;i++){
            if (arr[i]==1){
                k++;
                sb.append(i+" ");
            }
        }
        System.out.println(k+"\n"+sb);
    }
}
