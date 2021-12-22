
/*
          檔名: hw1109_2.java
          功能: 輸出中位數
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/9
          版本: 1.0
*/
import java.util.Scanner;

public class hw1109_2 {
    public static void main(String args[]) {
        int time = 1;
        String input[] = new String[10000];
        Scanner scn = new Scanner(System.in);
        while (time <= 10000) {
            System.out.print("enter:");
            input[time] = scn.nextLine();
            if (Integer.parseInt(input[time]) == 99999)
                break;
            if (time % 2 == 0) {
                float a = Integer.parseInt(input[time / 2]);
                float b = Integer.parseInt(input[(time / 2) + 1]);
                System.out.println((a + b) / 2);
            } else
                System.out.println(Integer.parseInt(input[(time / 2) + 1]));
            time++;
        }
    }
}