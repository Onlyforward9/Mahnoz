package Codeforces;

import java.io.*;
import java.util.Arrays;

public class m546d {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int p = 5000001;
        int[] sum = new int[p], arr = new int[p];
        Arrays.fill(arr, 1);
        for (int i = 2; i * 2 < p; i++)
            for (int j = i * 2; j < p; j += i) arr[j] = arr[i] + arr[j / i];
        for (int i = 1; i < p; i++) sum[i] = sum[i - 1] + arr[i];
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] ar = br.readLine().split(" ");
            pw.println(sum[Integer.parseInt(ar[0])] - sum[Integer.parseInt(ar[1])]);
        }
        pw.close();
    }
}
