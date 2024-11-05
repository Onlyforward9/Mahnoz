package Codeforces;

import java.util.Scanner;

public class m1033a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        if ((arr[0] >= arr[2] && arr[0] <= arr[4]) || (arr[0] <= arr[2] && arr[0] >= arr[4]) || (arr[1] >= arr[3] && arr[1] <= arr[5]) || (arr[1] <= arr[3] && arr[1] >= arr[5]))
            System.out.println("NO");
        else System.out.println("YES");
    }
}
