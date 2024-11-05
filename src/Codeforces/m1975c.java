package Codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class m1975c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 1; i < n; i++) set.add(Math.min(arr[i], arr[i - 1]));
            for (int i = 0; i < n - 2; i++) {
                int[] num = {arr[i], arr[i + 1], arr[i + 2]};
                Arrays.sort(num);
                set.add(num[1]);
            }
            System.out.println(set.pollLast());
        }
    }
}
