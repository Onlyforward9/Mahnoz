package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class m322b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] arr = {a % 3, b % 3, c % 3};
        Arrays.sort(arr);
        int p = a / 3 + b / 3 + c / 3;
        int o = arr[0] + arr[1] + arr[2];
        if (o == 6) p += 2;
        else if (p>0) {
            if (arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1) p += 1;
            else if (a!=0 && b!=0 && c!=0 && arr[0] == 0 && arr[1] == 2 && arr[2] == 2) p += 1;
        }
        System.out.println(p);
    }
}
