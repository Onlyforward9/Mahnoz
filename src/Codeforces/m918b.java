package Codeforces;

import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class m918b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[n];
        String[] num = new String[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String ip = sc.next();
            arr[i] = name;
            num[i] = ip + ";";
        }
        for (int i = 0; i < m; i++) {
            String ser = sc.next();
            String iip = sc.next();
            for (int j = 0; j < num.length; j++) {
                if (Objects.equals(iip, num[j])) {
                    pw.println(ser + " " + iip + " #" + (arr[j]));
                }
            }
        }
        pw.close();
    }
}
