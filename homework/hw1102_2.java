
/*
          檔名: hw1102_2.java
          功能: 判斷{}[]()
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/2
          版本: 1.0
*/
import java.util.Scanner;

public class hw1102_2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s;
        System.out.print("enter:");
        s = scn.nextLine();
        char s_num[] = s.toCharArray();
        int carry = 0, c;
        if (s_num.length % 2 != 0) {
            System.out.println("false");
            System.exit(0);
        }
        for (int x = 0; x < (s_num.length / 2); x++) {
            c = s_num[x] + s_num[s_num.length - x - 1];
            if (c != 81 && c != 184 && c != 248) {
                carry = 1;
                break;
            }
        }
        if (carry == 1) {
            for (int x = 0; x < s_num.length; x += 2) {
                c = (s_num[x] + s_num[x + 1]);
                if (c != 81 && c != 184 && c != 248) {
                    System.out.println("false");
                    carry = 1;
                    System.exit(0);
                }
            }
        }
        System.out.println("true");
    }
}
