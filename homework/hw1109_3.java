
/*
          檔名: hw1109_3.java
          功能: 輪流供電
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/9
          版本: 1.0
*/
import java.util.Scanner;

public class hw1109_3 {
    public static void main(String args[]) {
        int time = 0, input;
        int carry[] = new int[17];
        for (int x = 0; x < 17; x++)
            carry[x] = 0;
        Scanner scn = new Scanner(System.in);
        input = scn.nextInt();
        int x = 0;
        boolean check = false;
        for (int y = 1; y <= 18; y++) {
            if (time >= 17)
                break;
            for (int z = 0; z < 17; z++) {
                if (y == carry[z]) {
                    check = false;
                    break;
                } else
                    check = true;
            }
            if (check) {
                if (x % input == 0) {
                    carry[time] = y;
                    // System.out.print(carry[time] + " ");
                    time++;
                }
                x++;
                // System.out.print("x:" + x + " ");
            }
            if (y == 17)
                y = 1;
        }
        for (int y = 0; y < 17; y++)
            System.out.print(carry[y] + " ");
    }
}