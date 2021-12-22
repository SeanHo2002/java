/*
          檔名: hw1123_1.java
          功能: 第101個emirp(期中考第一題改寫)
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/23
          版本: 1.0
*/
public class hw1123_1 {
    public static void main(String args[]) {
        int emirp = 0, x = 12;
        while (emirp < 101) {
            x++;
            if (isPrime(reverse(x)) && isPrime(x))
                if (reverse(x) != x) {
                    emirp++;
                    // System.out.println(emirp+":("+x+","+f2(x)+")");
                }
        }
        System.out.println("101emirp:" + x);
    }

    static boolean isPrime(int in) {// 找質數
        boolean check = true;
        for (int x = 2; x < in; x++) {
            if (in % x == 0) {
                check = false;
                break;
            } else
                check = true;

        }
        return check;
    }

    static int reverse(int in) {// 倒數
        int out = 0;
        while (in > 0) {
            out *= 10;
            out += (in % 10);
            in /= 10;
        }
        return out;
    }
}