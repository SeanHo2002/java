
/*
          檔名: hw1026_2.java
          功能: 印三角形
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/26
          版本: 1.0
*/
import java.util.Scanner;

public class hw1026_2 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = 9;
        System.out.print("請輸入層數:");
        n = scn.nextInt();
        for (int x = 0; x < (n / 2) + 1; x++) {
            for (int y = 0; y < (n / 2) - x; y++)
                System.out.print(" ");
            for (int y = 0; y < (x * 2) + 1; y++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (int x = 0; x < n / 2; x++) {
            for (int y = 0; y <= x; y++)
                System.out.print(" ");
            for (int y = 0; y < n - ((x + 1) * 2); y++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
