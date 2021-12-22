
/*
          檔名: hw1019_1.java
          功能: 輸入成績，輸出及不及格
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/19
          版本: 1.0
*/
import java.util.Scanner;

public class hw1019_1 {
    public static void main(String args[]) throws Exception {
        Scanner scn = new Scanner(System.in);
        double score;
        while (true) {
            System.out.print("請輸入成績:");
            score = scn.nextInt();
            if (score > 100 || score < 0)
                System.out.println("分數不能大於100或小於0，請重新輸入");
            else if (score >= 60)
                System.out.println("及格");
            else if (score >= 50)
                System.out.println("可補考一次");
            else
                System.out.println("不及格");
        }
    }
}
