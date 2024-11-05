package Codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class m1006b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), res = 0,p=0;
        int[] arr = new int[n];
        int[] num = new int[n];
        for (int i = 0; i < n; i++) arr[i] = num[i] = sc.nextInt();
        Arrays.sort(arr);
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = arr.length - 1; i >= (n - k); i--) {
            list.add(arr[i]);
            res += arr[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(res + "\n");
        for (int i=0;i<n;i++){
            if (list.contains(num[i])){
                if (list.size()!=1){
                    list.remove((Integer) num[i]);
                    sb.append((i - p + 1) + " ");
                    p = i + 1;
                }else{
                    p= n- p;
                    break;
                }
            }
        }
        System.out.println(sb+""+p);
    }
}
