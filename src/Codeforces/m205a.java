package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m205a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int index_0 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= min) {
                min = arr[i];
                index_0 = i + 1;
            }
        }
        Arrays.sort(arr);
        System.out.println(n > 1 && arr[0] == arr[1] ? "Still Rozdil" : index_0);
    }
}
