package acmp;

import java.util.Scanner;

public class m641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),res=s.substring(2);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                res=solve(res,s.substring(0,i)+s.substring(i+1,j)+s.substring(j+1));
            }
        }
        System.out.println(res);
    }

    public static String solve(String a, String b) {
        char[] arr1 = a.toCharArray(), arr2 = b.toCharArray();
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] - '0' > arr2[i] - '0') return a;
            else if (arr1[i] - '0' < arr2[i] - '0')return b;
        }
        return b;
    }
}
