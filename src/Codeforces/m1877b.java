package Codeforces;

import java.util.*;

public class m1877b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), p = sc.nextInt();
            int[][] arr = new int[n][2];
            int[] num = new int[n];
            for (int i = 0; i < n; i++) num[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                arr[i][0] = b;
                arr[i][1] = num[i];
            }
            Arrays.sort(arr, (int[] i, int[] j) -> i[0] == j[0] ? i[1] - j[1] : i[0] - j[0]);
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < n - 1; i++) if (arr[i][0] != arr[i + 1][0]) set.add(i);
            int s = 0, k = n;
            long sum = 0;
            System.out.println(Arrays.deepToString(arr));
            out:
            for (int j : set) {
                sum += p;
                k--;
                for (int i = j; i >= s; i--) {
                    if (arr[i][0] > p || k == 0) break out;
                    else {
                        sum += (long) arr[i][0] * (Math.min(k, arr[i][1]));
                        k -= Math.min(k, arr[i][1]);
                    }
                }
                s = j + 1;
            }
            sum += (long) k * p;
            System.out.println(sum);
        }
    }
}
