package Codeforces;

import java.util.Scanner;

public class m2000a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            if(s.length()>2&&s.startsWith("10")&&(Integer.parseInt(s.substring(2))>9||(s.length()==3&&Integer.parseInt(s.substring(2))>1)))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
