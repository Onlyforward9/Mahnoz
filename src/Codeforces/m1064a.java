package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1064a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        System.out.println(Math.max(0, arr[2] - (arr[1] + arr[0])+1));
    }
}
