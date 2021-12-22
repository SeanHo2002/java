/*
          檔名: hw1026_1.java
          功能: 算圓周率
          作者: 資工二甲 何擎 40943113
          日期: 2021/10/26
          版本: 1.0
*/
public class hw1026_1 {
    public static void main(String args[]) {
        double pi_v = 0;
        int value = 0, tf_v = 0;
        double v = 0;
        for (double x = 1; x <= 200000; x++) {
            if (x % 2 == 0)
                pi_v -= 4 / (((x - 1) * 2) + 1);
            else
                pi_v += 4 / (((x - 1) * 2) + 1);
            System.out.println((int) x + ":" + pi_v);
            if (Math.round(pi_v * 100000.0) / 100000.0 == 3.14159 && tf_v == 0) {
                value = (int) x;
                v = pi_v;
                tf_v = 1;
            }
        }
        System.out.println("approximated 3.14159 value=" + value + ",value=" + v);
    }
}
