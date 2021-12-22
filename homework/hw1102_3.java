
/*
          檔名: hw1102_3.java
          功能: 判斷NESW
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/2
          版本: 1.0
*/
import java.util.Scanner;

public class hw1102_3 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s;
        System.out.print("enter:");
        s = scn.nextLine();
        char carry[] = s.toCharArray();
        int path[][] = new int[(carry.length * 2) + 1][(carry.length * 2) + 1];
        int x = carry.length, y = carry.length;
        for (int z = 0; z < carry.length; z++) {
            switch (carry[z]) {
                case 'w':
                    if (path[x - 1][y] != 1)
                        path[x - 1][y] = 1;
                    else {
                        System.out.println("true");
                        System.exit(0);
                    }
                    break;
                case 'e':
                    if (path[x + 1][y] != 1)
                        path[x + 1][y] = 1;
                    else {
                        System.out.println("true");
                        System.exit(0);
                    }
                    break;
                case 's':
                    if (path[x][y - 1] != 1)
                        path[x][y - 1] = 1;
                    else {
                        System.out.println("true");
                        System.exit(0);
                    }
                    break;
                case 'n':
                    if (path[x][y + 1] != 1)
                        path[x][y + 1] = 1;
                    else {
                        System.out.println("true");
                        System.exit(0);
                    }
                    break;
            }
        }
        System.out.println("flase");
    }
}
