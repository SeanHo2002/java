/*
          檔名: mid1117_1.java
          功能: 第101個emirp
          作者: 資工二甲 何擎 40943113
          日期: 2021/11/17
          版本: 1.0
*/
public class mid1117_1{
	public static void main(String args[]){
		int emirp=0,x=12;
		while(emirp<101){
			x++;
			if(f1(f2(x))&&f1(x))
				if(f2(x)!=x){
					emirp++;
					//System.out.println(emirp+":("+x+","+f2(x)+")");
				}
		}
		System.out.println("101emirp:"+x);
	}
	static boolean f1(int in){//找質數
		boolean check=true;
		for(int x=2;x<in;x++){
			if(in%x==0){
				check=false;
				break;
			}
			else
				check=true;

		}
		return check;
	}
	static int f2(int in){//倒數
		int out=0;
		while(in>0){
			out*=10;
			out+=(in%10);
			in/=10;
		}
		return out;
	}
}