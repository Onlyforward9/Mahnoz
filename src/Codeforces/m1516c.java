package Codeforces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class m1516c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), in = -1, s = 0, min = Integer.MAX_VALUE, o = -1, k = -1;
        int[] arr = new int[200001], num = new int[n];
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            for (int j = 1; j < arr.length; j++) {
                if (j == a && arr[j] == 0) arr[a] = i;
                if (arr[j] != 0 && a + j < arr.length && arr[j] != i && arr[a + j] == 0) arr[a + j] = i;
            }
            s += a;
            if (a % 2 == 1) in = i;
            else if ((a / 2) % 2 == 1) o = i;
            num[i - 1] = a;
        }
        if (s % 2 == 0 && arr[s / 2] != 0) {
            System.out.println("1");
            if (in != -1) System.out.println(in);
            else if (o != -1) System.out.println(o);
            else {
                int r = 1;
                HashSet<Integer> set = new HashSet<>();
                while (r < n) {
                    if (!set.contains(num[r - 1])) {
                        s = 0;
                        int[] ar = new int[200001];
                        for (int i = 1; i <= n; i++) {
                            if (i != r) {
                                int a = num[i - 1];
                                for (int j = 1; j < ar.length; j++) {
                                    if (j == a && ar[j] == 0) ar[a] = i;
                                    if (ar[j] != 0 && a + j < ar.length && ar[j] != i && ar[a + j] == 0) ar[a + j] = i;
                                }
                                s += a;
                            }
                        }
                        set.add(num[r - 1]);
                        if (ar[s / 2] == 0) {
                            System.out.println(r);
                            return;
                        }
                    }
                    r++;
                }
            }
        } else System.out.println(0);
    }
}
