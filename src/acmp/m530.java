package acmp;

import java.util.Scanner;

public class m530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), h = sc.nextInt();
        char[][] arr1 = new char[h][w];
        char[][] arr2 = new char[h][w];
        for (int i = 0; i < h; i++) arr1[i] = sc.next().toCharArray();
        for (int i = 0; i < h; i++) arr2[i] = sc.next().toCharArray();
        char[] arr = sc.next().toCharArray();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (arr1[i][j] == '0' && arr2[i][j] == '0') arr1[i][j] = arr[0];
                else if (arr1[i][j] == '0' && arr2[i][j] == '1') arr1[i][j] = arr[1];
                else if (arr1[i][j] == '1' && arr2[i][j] == '0') arr1[i][j] = arr[2];
                else arr1[i][j] = arr[3];
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) System.out.print(arr1[i][j]);
            System.out.println();
        }
    }
}
