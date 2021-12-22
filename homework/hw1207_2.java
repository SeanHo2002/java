/*
           檔名: hw1207_2.java
           功能: 矩形是否交集(矩形左下為起始座標)
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/07
           版本: 1.0
*/
public class hw1207_2 {
    static public void main(String arg[]) {
        Rectangle a = new Rectangle(0, 0, 5, 5);// x座標,y座標,長,寬
        Rectangle b = new Rectangle(6, 6, 3, 3);// x座標,y座標,長,寬
        Rectangle c = new Rectangle(0, 0, 4, 4);// x座標,y座標,長,寬
        Rectangle d = new Rectangle(3, 3, 3, 3);// x座標,y座標,長,寬
        a.IsIntersection(b);
        c.IsIntersection(d);
        a.IsIntersection(c);
        b.IsIntersection(d);
    }
}

class Rectangle {
    private int x = 0;
    private int y = 0;
    private int length = 0;
    private int width = 0;

    public Rectangle(int in_x, int in_y, int in_len, int in_wid) {// x座標,y座標,長,寬
        x = in_x;
        y = in_y;
        length = in_len;
        width = in_wid;
    }

    public void IsIntersection(Rectangle b) {
        if (b.x >= this.x && b.x <= this.x + this.length && b.y >= this.y && b.y <= this.y + this.width) {
            int l = 0, w = 0;
            if (b.x + b.length > this.x + this.length) {
                l = (this.x + this.length) - b.x;
                if (b.y + b.width > this.y + this.width)
                    w = (this.y + this.width) - b.y;
                else
                    w = b.y + b.width;
            } else {
                l = b.x + b.length;
                if (b.y + b.width > this.y + this.width)
                    w = (this.y + this.width) - b.y;
                else
                    w = b.y + b.width;
            }
            System.out.println("area:" + (l * w));
        } else
            System.out.println("Not Intersection!");
    }
}