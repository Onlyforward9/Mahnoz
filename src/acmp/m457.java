package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m457 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] arr = s.split("");
        Arrays.sort(arr);
        String a;
        String b;
        String o = "0000";
        int aa = 0;
        int k = 0;
        if (!s.equals("6174")){
            while (aa != 6174) {
                a = b = "";
                for (String value : arr) {
                    a += value;
                    b = value + b;
                }
                aa = Integer.parseInt(b) - Integer.parseInt(a);
                String str = String.valueOf(aa);
                str = aa + o.substring(0, 4 - str.length());
                arr = str.split("");
                Arrays.sort(arr);
                k++;
            }
        }
        System.out.println(aa + "\n" + k);
    }
}
