package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1992a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            for (int i=0;i<5;i++){
                arr[0]+=1;
                Arrays.sort(arr);
            }
            System.out.println(arr[0]*arr[1]*arr[2]);
        }
    }
}
