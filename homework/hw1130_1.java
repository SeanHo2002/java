
/*
           檔名: hw1130_1.java
           功能: 類別MyVector
           作者: 資工二甲 何擎 40943113
           日期: 2021/11/30
           版本: 1.0
*/
import java.util.Scanner;
import java.lang.Math;

public class hw1130_1 {
    public static void main(String args[]) {
        System.out.println("a's data:");
        MyVector a = new MyVector();
        System.out.println("b's data:");
        MyVector b = new MyVector();
        System.out.println("|a|:" + a.norm());
        System.out.println("|b|:" + b.norm());
        System.out.println("a*b:" + a.calculate_ip(b));
        System.out.println("cos(theta):" + a.calculate_cos(b));
    }
}

class MyVector {
    private int size;
    private double[] vector;

    public MyVector() {
        Scanner scn = new Scanner(System.in);
        System.out.print("vector size:");
        size = scn.nextInt();
        vector = new double[size];
        System.out.print("vector value(separate by space):");
        for (int x = 0; x < size; x++)
            vector[x] = scn.nextInt();
    }

    public double norm() {
        double ans = 0;
        for (int x = 0; x < size; x++)
            ans += Math.pow(vector[x], 2);
        ans = Math.sqrt(ans);
        return ans;
    }

    public double calculate_ip(MyVector b) {
        double ans = 0;
        if (size != b.size) {
            System.out.println("a's size!=b's size");
            return -1;
        }
        for (int x = 0; x < size; x++)
            ans += (vector[x] * b.vector[x]);
        return ans;
    }

    public double calculate_cos(MyVector b) {
        double ans = 0;
        double norm_a = norm();
        double norm_b = b.norm();
        double ip = calculate_ip(b);
        ans = ip / (norm_a * norm_b);
        return ans;
    }
}