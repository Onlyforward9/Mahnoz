package Toi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("@") && s.charAt(0) != '@' && !s.endsWith("@")) {
            int l = s.length() - s.replace("@", "").length();
            if (l != 1) System.out.println("NO");
            else {
                int username = s.indexOf("@");
                if (s.contains(".")){
                    int hostname=s.length()-s.lastIndexOf(".");
                    if (username<=16 && hostname<=32 && s.length()-hostname-username<=16)
                        System.out.println("YES");
                    else System.out.println("NO");
                }else {
                    if (s.length()-s.indexOf("@")-1<=48)
                        System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }else System.out.println("NO");
    }
}
//qG3@LKp
//o3EaAnc3K6@h
//OlS_OwxYhH@im.0A7o/juNlxB
//xkjHHDRBEFwgNP@G9TGStEs2Lu.BJge3EBXw3c9EfE
//bK@8X7tQO.pXBHJpDewD
//kKUXy6@0WefbXz39ywP.Q3r7uF
//4lBJkY8c097oa@ZYmVbtiyyYN.gbj
//F@JX4.SI1/0EY3XmYatfY
//xLEctap0T@22U9W_fA/7iQeJGFu1lSgMZ
//WYh@yUWfOQiF.gOK9k8aEa
//mGIY@cHRNC8GlJ/2pcl3LYxpi3PaKGs
//cUIr@cP.eGQC2xJXvI1X7
//MLZ6e1vgZ4hOI@ktWk.Ro.o6C4/i8cnKHT
//XCJIa@jFaP.Eu28YaoT9Z.Epk.Z/4TBzLWf724zE1r
//nrKbWV@P0irxQoRxDsNvG/69WxCwCsfB
//IGsma3L6YTJRrXS@1g.yR3mC.c.xoCns7Wo1.9C.Oe.5ebkR/_97Ltj3
//Uu538LDu9Bye@Gu0W0P5a.b9zA9nSaNhzB_TQ2.z/qfi5CZrH
//bdHl525me@XzR_iO23v.YFXbnHUybbgw.i/WVEhm
//NQsZ0K@eE8VMB.w2nYtKImB.4nUF
//186@E.MmBaKLj.WYpt4wPZkzv93
//_I4ytjyccT@q.WIc.Cqn
//LwHHRYq@whOoq.e9b6i0xnoWBl7z.SGJiJe/iUij1x7
//Zu5VFUtSbIw@ner5e
