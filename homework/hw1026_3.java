
/*
          檔名: hw1026_3.java
          功能: 找離輸入的數最靠近之最大最小平方數
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/26
          版本: 1.0
*/
import java.util.Scanner;

public class hw1026_3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = 0, m = 0, n = 0;
        System.out.print("請輸入一數:");
        num = scn.nextInt();
        for (int x = 0; x < num; x++) {
            if (Math.pow((x + 1), 2) >= num) {
                m = x;
                n = m + 1;
                break;
            }
        }
        System.out.print("m:" + m + ",n:" + n);
    }
}
