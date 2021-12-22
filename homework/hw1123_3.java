
/*
          檔名: hw1123_1.java
          功能: 螺旋二維陣列
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/23
          版本: 1.0
*/
import java.util.Scanner;

public class hw1123_3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int frequency;
        frequency = scn.nextInt();
        int[] n = new int[frequency];
        int[] dir = new int[frequency];
        for (int x = 0; x < frequency; x++) {
            n[x] = scn.nextInt();
            dir[x] = scn.nextInt();
        }
        System.out.println("Output");
        for (int x = 0; x < frequency; x++) {
            int[][] ans = new int[n[x]][n[x]];
            ans = spinMatrix(n[x], dir[x]);
            for (int y = 0; y < n[x]; y++) {
                for (int z = 0; z < n[x]; z++)
                    System.out.print(ans[y][z] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][] spinMatrix(int n, int dir) {
        int x = 0, y = 0, time, num = 1;
        int[][] re = new int[n][n];
        x = -1;
        y = 0;
        if (n % 2 == 0)
            time = n / 2;
        else {
            time = (n / 2) + 1;
            re[time - 1][time - 1] = n * n;
        }
        for (int i = 0; i < time; i++) {
            for (int j = 0 + i; j < n - 1 - i; j++) {
                x++;
                re[y][x] = num;
                num++;
            }
            x++;
            y--;
            for (int j = 0 + i; j < n - 1 - i; j++) {
                y++;
                re[y][x] = num;
                num++;
            }
            y++;
            x++;
            for (int j = 0 + i; j < n - 1 - i; j++) {
                x--;
                re[y][x] = num;
                num++;
            }
            x--;
            y++;
            for (int j = 0 + i; j < n - 1 - i; j++) {
                y--;
                re[y][x] = num;
                num++;
            }
        }
        int[][] ans = new int[n][n];
        if (dir == 1) {
            ans = re;
        } else if (dir == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans[i][j] = re[j][i];
                }
            }
        }
        return ans;
    }
}
