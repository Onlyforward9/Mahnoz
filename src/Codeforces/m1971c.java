package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m1971c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] arr = {sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            int l = sc.nextInt(), r = sc.nextInt(), k=0;
            k = l > arr[0] && l < arr[1] ? k + 1 : k;
            k = r > arr[0] && r < arr[1] ? k + 1 : k;
            System.out.println(k == 1 ? "YES" : "NO");
        }
    }
}
