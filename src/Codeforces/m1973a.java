package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1973a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            if ((arr[0]+arr[1]+arr[2])%2!=0) System.out.println(-1);
            else {
                int k=0;
                while (arr[1]>0){
                    arr[1]--;
                    arr[2]--;
                    k++;
                    Arrays.sort(arr);
                }
                System.out.println(k);
            }
        }
    }
}
