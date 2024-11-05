package Codeforces;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class m1957a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>list=new ArrayList<>();
        int a=sc.nextInt();
        for (int i = 0; i <a ; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
//arr[i]    list.get(i)