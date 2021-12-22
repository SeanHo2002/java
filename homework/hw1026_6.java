
/*
          檔名: hw1026_6.java
          功能: 算利息
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/26
          版本: 1.0
*/
import java.util.Scanner;

public class hw1026_6 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = 0, years = 0, total = 0;
        double rate = 0;
        System.out.print("請輸入存入金額:");
        n = scn.nextInt();
        System.out.print("請輸入利率:");
        rate = scn.nextDouble();
        System.out.print("請輸入儲蓄年數:");
        years = scn.nextInt();
        for (int x = 1; x <= years; x++) {
            n += n * rate;
        }
        System.out.print("存款:" + n);
    }
}
