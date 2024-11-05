package Codeforces;

import java.util.Scanner;

public class m1956b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -->0){
            int n=sc.nextInt();
            int []arr=new int[n+1];
            for (int i=0;i<n;i++)arr[sc.nextInt()]++;
            int k=0;
            for (int i=1;i<=n;i++){
                if (arr[i]==2)k++;
            }
            System.out.println(k);
        }
    }
}
