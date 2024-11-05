package acmp;

import java.util.Scanner;

public class m81 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        System.out.println(min+" "+max);
    }
}
