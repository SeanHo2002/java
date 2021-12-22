/*
          檔名: hw1025_1.java
          功能: 九九乘法表(偶數基數)
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/25
          版本: 1.0
*/
public class hw1025_2 {
    public static void main(String args[]) {
        for (int x = 1; x < 10; x += 2) {
            for (int y = 1; y < 10; y += 2)
                System.out.print(x + "x" + y + "=" + x * y + " ");
            for (int y = 2; y < 10; y += 2)
                System.out.print(x + "x" + y + "=" + x * y + " ");
            System.out.print("\n");
        }
        for (int x = 2; x < 10; x += 2) {
            for (int y = 1; y < 10; y += 2)
                System.out.print(x + "x" + y + "=" + x * y + " ");
            for (int y = 2; y < 10; y += 2)
                System.out.print(x + "x" + y + "=" + x * y + " ");
            System.out.print("\n");
        }
    }
}