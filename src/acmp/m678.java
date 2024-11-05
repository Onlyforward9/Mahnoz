package acmp;

import java.util.Scanner;

public class m678 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int p=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                p=arr[0];
                arr[0] = arr[1];
                arr[1]=p;
            } else if (s.charAt(i) == 'B'){
                p=arr[2];
                arr[2] = arr[1];
                arr[1]=p;
            } else {
                p=arr[0];
                arr[0] = arr[2];
                arr[2]=p;
            }
        }
        for (int i = 0; true; i++) {
            if (arr[i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
