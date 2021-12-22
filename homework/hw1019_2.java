
/*
          檔名: hw1019_2.java
          功能: 判斷三個數值大中小(用?:)
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/19
          版本: 1.0
*/
import java.util.Scanner;

public class hw1019_2 {
    public static void main(String args[]) throws Exception {
        Scanner scn = new Scanner(System.in);
        double score1, score2, score3;
        while (true) {
            System.out.print("請輸入第一個數個數:");
            score1 = scn.nextDouble();
            System.out.print("請輸入第二個數個數:");
            score2 = scn.nextDouble();
            System.out.print("請輸入第三個數個數:");
            score3 = scn.nextDouble();
            double big_carry = (score1 > score2) ? score1 : score2;
            double big = (score3 > big_carry) ? score3 : big_carry;
            double small_carry = (score1 < score2) ? score1 : score2;
            double small = (score3 < small_carry) ? score3 : small_carry;
            double mid = 0;
            mid = (score1 != big && score1 != small) ? score1 : mid;
            mid = (score2 != big && score2 != small) ? score2 : mid;
            mid = (score3 != big && score3 != small) ? score3 : mid;
            System.out.println("最大值:" + big + "最小值:" + small + "中間值:" + mid);
        }
    }
}
