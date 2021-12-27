/*
           檔名: hw1227.java
           功能: 利用inner class 的技巧，限制 Rectangle 類別只能被建立出一個物件被使用
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/27
           版本: 1.0
*/
public class hw1227 {
    public static void main(String args[]){
        Rectangle test1=Rectangle.getInstance();
        Rectangle test2=Rectangle.getInstance();
        test1.SetH(4);
        test2.SetW(6);
        //上兩函式指向同一個物件
        System.out.println("Area:"+test1.GetArea());
        //h,w未設定初始值,test1只設定h,test2只設定w
        //GetArea可證明test1和test2為同一物件
    }
}
class Rectangle{
    private Rectangle(){}
    private int h;
    private int w;
    private static class SingletonHelper{
        private static final Rectangle INSTANCE=new Rectangle();
    }
    public static Rectangle getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public void SetH(int in){
        h=in;
    }
    public void SetW(int in){
        w=in;
    }
    public int GetArea(){
        return h*w;
    }
}
