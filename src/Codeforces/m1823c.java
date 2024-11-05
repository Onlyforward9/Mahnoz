package Codeforces;

import java.util.Scanner;

public class m1823c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[]arr=new int[10000001];
        arr[1]=1;
        for (int i=3;i<arr.length/2+1;i+=2){
            for (int j=2*i;j<arr.length;j+=i){
                arr[j]=1;
            }
        }
        while (t-- > 0) {
            int n = sc.nextInt();

        }
    }
}
