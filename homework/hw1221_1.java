/*
           檔名: hw1221_1.java
           功能: 利用靜態區塊 static block建立 Rectangle 類別 並限制此類別只能建立出一個物件
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/21
           版本: 1.0
*/
public class hw1221_1 {
    public static void main(String args[]) {
        Rectangle test1=Rectangle.getInstance();
        Rectangle test2=Rectangle.getInstance();
        test1.SetH(10);
        test2.SetW(5);
        //上兩函式指向同一個物件
        System.out.println("Area:"+test1.GetArea());
        //h,w未設定初始值,test1只設定h,test2只設定w
        //GetArea可證明test1和test2為同一物件
    }
}
class Rectangle{
    private static Rectangle instance;
    private int h;
    private int w;
    private Rectangle(){}
    static{
        try{
            instance=new Rectangle();
        }
        catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    public static Rectangle getInstance(){
        return instance;
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
