package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m478c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        long min = Math.min(arr[2], (arr[1] + arr[0]) * 2);
        System.out.println((arr[0] + arr[1] + min) / 3);
    }
}
