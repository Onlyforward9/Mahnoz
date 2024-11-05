package acmp;

import java.io.PrintWriter;
import java.util.Scanner;

public class m926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            k += arr.length - arr[i].replace("C", "").length();
        }
        k/=2;
        char ch='1';
        for (String s : arr) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'C') {
                    if (k > 0) {
                        sb.append("1");
                        k--;
                    } else {
                        sb.append("2");
                        ch='2';
                    }
                } else sb.append(ch);
            }
            pw.println(sb);
        }
        pw.close();
    }
}
