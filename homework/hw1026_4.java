
/*
          檔名: hw1026_4.java
          功能: 倒數
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/26
          版本: 1.0
*/
import java.util.Scanner;

public class hw1026_4 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = 0, value = 0;
        System.out.print("請輸入一數:");
        num = scn.nextInt();
        while (num >= 10) {
            value *= 10;
            value += num % 10;
            num /= 10;
        }
        value *= 10;
        value += num % 10;
        System.out.print(value);
    }
}
