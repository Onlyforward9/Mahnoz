package Codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class m1928b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) set.add(sc.nextInt());
            Integer[] arr = new Integer[set.size()];
            int j = 0;
            for (int i : set) {
                arr[j] = i;
                j++;
            }
            int s = arr[0];
            j=1;
            int k = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - s < n) k++;
                else {
                    max = Math.max(max, k);
                    s = arr[j];
                    j++;
                }
            }
            System.out.println(Math.max(max, k));
        }
    }
}
