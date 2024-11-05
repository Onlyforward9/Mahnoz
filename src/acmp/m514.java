package acmp;

import java.util.Scanner;

public class m514 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 1;
        int k = 0;
        while (n-t>=0){
            k++;
            n-=t;
            t++;
        }
        System.out.println(k);
    }
}
