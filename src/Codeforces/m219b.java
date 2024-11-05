package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m219b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r = sc.nextLong(), l = sc.nextLong();
        l = r - l;
        String s = "0" + r;
        long p = l;
        for (int i = s.length() - 1; i >= 1; i--) {
            String res="";
            int j=i;
            while (j<s.length()){
                res+="9";
                j++;
            }
            if (s.charAt(i) != '9') {
                while (i>0 && s.charAt(i - 1) == '0') {
                    i--;
                    res = "9" + res;
                }
                res = i>0?"" + (s.charAt(i-1) - '0' - 1) + res:res;
            }
            res = s.substring(0, i-1) + res;
            if (Long.parseLong(res) >= l) p = Long.parseLong(res);
            else break;
        }
        System.out.println(p/10);
    }
}
//099999
// sout(n/3+" "+n%2)