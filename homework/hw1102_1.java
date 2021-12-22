
/*
          檔名: hw1102_1.java
          功能: 數字三角形找數字
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/2
          版本: 1.1
*/
import java.util.Scanner;

public class hw1102_1 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = 0, carry = 0, num;
        System.out.print("請輸入高度:");
        n = scn.nextInt();
        int triangle[][] = new int[n][n];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y <= x; y++) {
                triangle[x][y] = carry;
                carry++;
            }
        }
        for (int x = 0; x < n; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(triangle[x][y] + ",");
            }
            System.out.println("\n");
        }
        carry = 0;
        System.out.print("請輸入被尋找的數:");
        num = scn.nextInt();
        for (int x = 0; x < n; x++) {
            for (int y = 0; y <= x; y++) {
                if (triangle[x][y] == num) {
                    System.out.println("列:" + (x + 1) + "行:" + (y + 1));
                    break;
                }
            }
        }
    }
}