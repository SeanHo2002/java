
/*
          檔名: hw1108.java
          功能: 烏龜畫畫
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/8
          版本: 1.0
*/
import java.util.Scanner;

class Turtle {
    private int[][] map = new int[10][10];
    private int turtle_locate_x, turtle_locate_y, pen, turtle_direction;
    private int command, command2;
    boolean check;
    String carry;
    Scanner scn = new Scanner(System.in);

    public Turtle() {
        for (int x = 0; x < 10; x++)
            for (int y = 0; y < 10; y++)
                map[x][y] = 0;
        turtle_locate_x = 3;
        turtle_locate_y = 6;
        pen = 1;// 1up,2down
        turtle_direction = 0;// 0123北東南西
        check = true;
    }

    public void Start() {
        while (check) {
            // System.out.print("請輸入指令:");
            carry = scn.nextLine();
            String[] carry2 = carry.split(",");
            if (carry2.length > 1) {
                command = Integer.parseInt(carry2[0]);
                command2 = Integer.parseInt(carry2[1]);
                check = this.Command(command, command2);
            } else {
                command = Integer.parseInt(carry2[0]);
                check = this.Command(command, 0);
            }
        }
    }

    public boolean Command(int input, int input2) {
        boolean re = true;
        switch (command) {
            case 1:// 筆提起
                pen = 1;
                break;
            case 2:// 筆放下
                pen = 2;
                break;
            case 3:// 向右轉
                turtle_direction += 1;
                if (turtle_direction >= 4)
                    turtle_direction = 0;
                break;
            case 4:// 向左轉
                turtle_direction -= 1;
                if (turtle_direction <= -1)
                    turtle_direction = 3;
                break;
            case 5:// 移動
                for (int x = 0; x < input2; x++) {
                    if (x == 0) {
                        if (pen == 2) // down
                            map[turtle_locate_x][turtle_locate_y] = 1;
                    } else {
                        if (pen == 2) // down
                            map[turtle_locate_x][turtle_locate_y] = 1;
                        if (turtle_direction == 0)// 北
                            turtle_locate_y -= 1;
                        else if (turtle_direction == 1)// 東
                            turtle_locate_x += 1;
                        else if (turtle_direction == 2)// 南
                            turtle_locate_y += 1;
                        else if (turtle_direction == 3)// 西
                            turtle_locate_x -= 1;
                    }
                }
                // System.out.println("x:" + turtle_locate_x + "y:" + turtle_locate_y);
                break;
            case 6:// 印出資料
                System.out.print("  ");
                for (int y = 0; y < 11; y++) {
                    for (int x = 0; x < 11; x++) {
                        if (y != 0 && x == 0)
                            System.out.print(y + " ");
                        if (x != 0 && y == 0)
                            System.out.print(x + " ");
                        if (x >= 1 && y >= 1) {
                            if (map[x - 1][y - 1] == 1)
                                System.out.print("1 ");
                            else
                                System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 9:// 結束
                re = false;
                break;
            case 10:// test
                for (int y = 0; y < 10; y++) {
                    for (int x = 0; x < 10; x++) {
                        System.out.print(map[x][y]);
                    }
                    System.out.println();
                }
                break;

        }
        return re;
    }
}

public class hw1108 {
    public static void main(String args[]) {
        Turtle a = new Turtle();
        a.Start();
    }
}
