package acmp;

import java.util.Scanner;

public class m818 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum-n+1);
    }
}
