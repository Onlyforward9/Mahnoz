package Codeforces;

import java.util.Scanner;

public class m1538d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
            int l = 0, m = 0;
            if (k == 1) {
                if (a != b && (a % b == 0 || b % a == 0))
                    System.out.println("YES");
                else System.out.println("NO");
            } else {
                while (a != 1) {
                    int h = a;
                    for (int i = 2; i * i <= a; i++) {
                        if (a % i == 0) {
                            a /= i;
                            break;
                        }
                    }
                    l++;
                    if (h == a) break;
                }
                while (b != 1) {
                    int h = b;
                    for (int i = 2; i * i <= b; i++) {
                        if (b % i == 0) {
                            b /= i;
                            break;
                        }
                    }
                    m++;
                    if (h == b) break;
                }
                System.out.println(l + m >= k ? "YES" : "NO");
            }
        }
    }
}
//
//    Транскрипция
//            Перевод
//Арабский
//        Аллахумма, инна наста‘иинука ва настагфирука
//        ва ну’мину бика ва натаваккалю 'аляйк,
//        ва нусни 'аляйкаль-хайра нашкурук,
//        ва ля накфурук,
//        ва нахля'у ва натруку май-яфджурук.
//        Аллахумма, ийяка на'буду,
//        ва ляка нусолли ва насджуд,
//        ва иляйка нас'а ва нахфид,
//        нарджу рахматака,
//        ва нахша 'азабака,
//        инна 'азабакаль джидда биль-куффари мульхик
//04:21
//        Фаджр
//        До Фаджра осталось
//        02 часа 41 минута
//        05:54
//        Восход
//        12:26
//        Зухр
//        17:02
//        Аср
//        18:55
//        Магриб
//        20:22
//        Иша