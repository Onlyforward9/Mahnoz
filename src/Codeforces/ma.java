package Codeforces;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ma {
    public static int sum_num(int n) {
        int p = 0;
        String o = String.valueOf(n);
        for (int i = 0; i < o.length(); i++) {
            p += Integer.parseInt(o.substring(i, i + 1));
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        Integer[] arr = new Integer[t];
        Integer[] res = new Integer[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
            res[i] = arr[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int o = 0;
        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            int p = o;
            p += sum_num(i);
            map.put(i, p);
            o = p;
        }
        for (int i = 0; i < res.length; i++) {
            pw.println(map.get(res[i]));
        }
        pw.close();
    }
}
