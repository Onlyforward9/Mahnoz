package acmp;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class m13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
        while (t-- > 0) {
            int r1 = sc.nextInt();
            int r2 = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();
            int s = m(r1, r2, x2, y2, x1, y1) + m(r1, r2, x2, y2, x3, y3) + m(r1, r2, x3, y3, x4, y4) + m(r1, r2, x4, y4, x1, y1);
//            int aa=p(x1,y1,x2,y2);
//            int bb=p(x2,y2,x3,y3);
//            int cc=p(x3,y3,x4,y4);
////            int dd=p(x4,y4,x1,y1);
//            int pp= (int) (Math.min(Math.min(aa,dd),Math.min(bb,cc))*Math.max(Math.max(aa,dd),Math.max(bb,cc)));
//            if (pp==s){
            k++;
        }
    }
//        System.out.println(k);

    public static int m(int x1, int y1, int x2, int y2, int x3, int y3) {
        int c = (int) sqrt(Math.pow(y1 - y2, 2) + Math.pow(x1 - x2, 2));
        int a = (int) sqrt(Math.pow(y2 - y3, 2) + Math.pow(x2 - x3, 2));
        int b = (int) sqrt(Math.pow(y1 - y3, 2) + Math.pow(x1 - x3, 2));
        int p = (a + b + c) / 2;
        return (int) sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double p(int x1, int y1, int x2, int y2) {
        int a = Math.abs(y1 - x1);
        int b = Math.abs(x2 - y2);
        return Math.sqrt(a * a + b * b);
    }
}
