
/*
          檔名: hw1123_1.java
          功能: 排序二維陣列
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/23
          版本: 1.0
*/
import java.util.Scanner;

public class hw1123_2 {
    public static void main(String args[]) {
        int frequency, num1, num2;
        Scanner scn = new Scanner(System.in);
        // System.out.print("input data frequency:");
        frequency = scn.nextInt();
        int[][] data = new int[frequency][2];
        int[][] ans = new int[frequency][2];
        for (int x = 0; x < frequency; x++) {
            // System.out.print("input " + x + " data:");
            num1 = scn.nextInt();
            num2 = scn.nextInt();
            data[x][0] = num1;
            data[x][1] = num2;
        }
        ans = twoDimSort(data);
        System.out.println("Output");
        for (int x = 0; x < frequency; x++)
            System.out.println(ans[x][0] + " " + ans[x][1]);
    }

    public static int[][] twoDimSort(int[][] matrix) {
        int[] num1 = new int[matrix.length];
        int[] num2 = new int[matrix.length];
        int carry;
        for (int x = 0; x < matrix.length; x++) {
            num1[x] = matrix[x][0];
            num2[x] = matrix[x][1];
        }
        for (int x = 0; x < matrix.length; x++) {
            for (int y = x; y < matrix.length; y++) {
                if (num1[x] > num1[y]) {
                    carry = num1[y];
                    num1[y] = num1[x];
                    num1[x] = carry;
                }
                if (num2[x] > num2[y]) {
                    carry = num2[y];
                    num2[y] = num2[x];
                    num2[x] = carry;
                }
            }
        }
        for (int x = 0; x < matrix.length; x++) {
            matrix[x][0] = num1[x];
            matrix[x][1] = num2[x];
        }
        return matrix;
    }
}
