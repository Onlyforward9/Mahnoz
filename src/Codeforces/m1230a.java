package Codeforces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class m1230a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        System.out.println(arr[0] + arr[1] == arr[2] + arr[3] || arr[0] + arr[1] + arr[2] == arr[3] || arr[0] + arr[3] == arr[1] + arr[2] || arr[0] + arr[2] == arr[1] + arr[3] ? "YES" : "NO");
    }
}
//3 14 36 53
// 2 6 8 10