package acmp;

import java.util.Arrays;
import java.util.Scanner;

public class m633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String team = sc.nextLine();
        String[] arr = {sc.nextLine(), sc.nextLine(), sc.nextLine()};
        Arrays.sort(arr);
        System.out.println(team + ": " + arr[0] + ", " + arr[1] + ", " + arr[2]);
    }
}
