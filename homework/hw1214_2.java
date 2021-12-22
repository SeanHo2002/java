
/*
           檔名: hw1214_2.java
           功能: 矩形是否交集(矩形左下為起始座標)
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/14
           版本: 1.0
*/
public class hw1214_2 {
    public static void main(String args[]) {
        Rectangle Rectangle1 = Rectangle.getInstance();
        Rectangle Rectangle2 = Rectangle.getInstance();
        Rectangle1.SetName("Rectangle1");
        Rectangle2.SetName("Rectangle2");
        System.out.println("Rectangle1 Name:" + Rectangle1.GetName());
        System.out.println("Rectangle2 Name:" + Rectangle2.GetName());
    }
}

class Rectangle {

    private static final Rectangle instance = new Rectangle();
    private String name;

    private Rectangle() {
    }

    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public static Rectangle getInstance() {
        return instance;
    }
}
