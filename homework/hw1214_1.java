/*
           檔名: hw1214_1.java
           功能: 矩形是否交集(矩形左下為起始座標)
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/14
           版本: 1.0
*/
public class hw1214_1 {
    public static void main(String args[]) {
        // Circle c1 = new Circle(2, 2, 2);
        // System.out.println("main time:" + c1.time);
        Circle.Show();
    }
}

class Circle {
    public static int time = 0;
    private static int item = 2;
    private int num = 1;

    {
        System.out.println("non-static block time:" + time);
    }

    static {
        System.out.println("static block time:" + time);
        time = 1;
    }

    public Circle(int t, int i, int n) {
        System.out.println("constructor time:" + time);
        time = t;
        item = i;
        num = n;
    }

    public void ShowNum() {
        System.out.println("num:" + num);
    }

    public static void Show() {
        System.out.println("time:" + time + "\nitem:" + item);
    }
}
