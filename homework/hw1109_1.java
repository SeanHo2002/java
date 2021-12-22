/*
          檔名: hw1109_1.java
          功能: 迴文數
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/9
          版本: 1.0
*/
public class hw1109_1 {
    public static void main(String args[]) {
        int time = 0;
        for (int x = 1; x <= 10000; x++) {
            int carry = x;
            if (x >= 10 && x < 100) {
                int a = carry % 10;
                if (a == carry / 10) {
                    System.out.print(x + " ");
                    time++;
                }
            } else if (x >= 100 && x < 1000) {
                int a0;
                a0 = carry / 100;
                carry %= 100;
                carry %= 10;
                if (a0 == carry) {
                    System.out.print(x + " ");
                    time++;
                }
            } else if (x >= 1000 && x < 10000) {
                int a0, a1, a2;
                a0 = carry / 1000;
                carry %= 1000;
                a1 = carry / 100;
                carry %= 100;
                a2 = carry / 10;
                carry %= 10;
                if (a0 == carry && a1 == a2) {
                    System.out.print(x + " ");
                    time++;
                }
            }
            if (time == 10) {
                System.out.println();
                time = 0;
            }
        }
    }
}