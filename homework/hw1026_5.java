/*
          檔名: hw1026_5.java
          功能: 印出三位數(第1數<第2數<第3數)
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/26
          版本: 1.0
*/
public class hw1026_5 {
    public static void main(String args[]) {
        int time = 0;
        for (int x = 100; x <= 999; x++) {
            if (x / 100 < (x % 100) / 10) {
                if ((x % 100) / 10 < (x % 10)) {
                    System.out.print(x + " ");
                    time++;
                    if (time % 10 == 0)
                        System.out.print("\n");
                }
            }
        }
    }
}
