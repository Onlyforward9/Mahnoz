package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m903 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextInt();
        long a5=0,a3=0,a1=0;
        for (int j : arr) a5 += j + a5;
        for (int i=arr.length-1;i>=0;i--)a3+=arr[i]+a3;
        Arrays.sort(arr);
        for (int j : arr) a1 += j + a1;
        if (a1<=a3 && a1<=a5) System.out.println(1);
        else if (a3<=a1 && a3<=a5) System.out.println(5);
        else System.out.println(5);
    }
}
