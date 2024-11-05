package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class m1742e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            Integer[] arr = new Integer[n];
            Long[] sum = new Long[n+1];
            sum[0] = 0L;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum[i+1] = sum[i] + arr[i];
            }
            HashMap<Integer, Long> map = new HashMap<>();
            Integer[] num = new Integer[m];
            Integer[] res = new Integer[m];
            for (int i = 0; i < m; i++) {
                num[i] = sc.nextInt();
                res[i] = num[i];
            }
            Arrays.sort(num);
            int j = 0;
            for (int i = 0; i < m; i++) {
                for (; j < arr.length; j++) {
                    if (num[i] < arr[j]) {
                        map.put(num[i], sum[j]);
                        break;
                    }
                }
                if (j == arr.length) map.put(num[i], sum[n]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i : res) {
                sb.append(map.get(i) + " ");
            }
            pw.println(sb);
        }
        pw.close();
    }
}
