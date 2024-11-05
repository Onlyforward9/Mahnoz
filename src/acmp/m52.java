package acmp;

import java.util.Scanner;

public class m52 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int s1= Integer.parseInt(s.substring(0,1));
        int s2= Integer.parseInt(s.substring(1,2));
        int s3= Integer.parseInt(s.substring(2,3));
        int s4= Integer.parseInt(s.substring(3,4));
        int s5= Integer.parseInt(s.substring(4,5));
        int s6= Integer.parseInt(s.substring(5,6));
        if (s1+s2+s3==s4+s5+s6) System.out.println("YES");
        else System.out.println("NO");
    }
}
