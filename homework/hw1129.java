/*
           檔名: hw1129.java
           功能: class練習
           作者: 資工二甲 何擎 40943113
           日期: 2021/11/29
           版本: 1.0
*/
import java.util.Scanner;
public class hw1129{
    public static void main(String args[]){
        Account john=new Account();
        john.deposit(500);
        System.out.println("John balance is "+john.balancing());
        john.withdraw(300);
        System.out.println("John balance is "+john.balancing());
    }
}
class Account{
    int money=0;
    void deposit(int in){
        money+=in;
    }
    void withdraw(int in){
        money-=in;
    }
    int balancing(){
        return money;
    }
}