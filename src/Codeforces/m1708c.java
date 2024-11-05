package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class m1708c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt(), k = 0;
        int[] arr = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (q >= a) arr[i] = 1;
            else {
                if (q != 0) {
                    q--;
                    set.add(i);
                    arr[i] = 1;
                } else {
                    
                }
            }
        }
    }
}
