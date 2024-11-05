package Codeforces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class m988b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        String r = arr[0], sb = "";
        for (int i = 0; i < n; i++) {
            if (arr[i].contains(r)) {
                r = arr[i];
                sb += arr[i] + "\n";
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES\n" + sb);
    }
}
