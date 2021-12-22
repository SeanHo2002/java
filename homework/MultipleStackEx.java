/* 
    檔名: MultipleStackEx.java
    功能:多重堆疊類別(12/13考試)
    作者:資工二甲/40943113/何擎
    日期:2021/12/13
    版本:1.0
*/
public class  MultipleStackEx{
    static public void main(String args[]){
        MultipleStack stk = new MultipleStack(3, 4);

        stk.push(1, 2); // 將數字 1 放入堆疊 2 
        stk.push(7, 1); // 將數字 7 放入堆疊 1 
        stk.push(8, 0); // 將數字 8 放入堆疊 0 
        stk.push(-2, 1);  // 將數字 -2 放入堆疊 1 
        stk.push(9, 6); // 將數字 9 放入堆疊 6, 程式應印出錯誤訊息, 告知使用者無堆疊 6
        stk.push(11, 1); // 將數字 11 放入堆疊 1  
        stk.push(0, 1); // 將數字 0 放入堆疊 1 
        stk.push(4, 1); // 將數字 4 放入堆疊 1, 程式應印出錯誤訊息, 告知使用者堆疊已滿       
        stk.print(); // 印出每個堆疊的內容，以先進後出的順序印出
        System.out.println("pop a number from stack 2: "+ stk.pop(2)); //由堆疊 2 取出資料並印出
        stk.pop(2); //由堆疊 2 取出資料, 程式應印出錯誤訊息告知堆疊 2 已空，無法完成 pop     
    }
}
class MultipleStack{
    private int top[];
    private int max_size;
    private int max_stack;
    private int arr[][];
    public boolean IsEmpty(int stack_ID){
    if(top[stack_ID]==0)
        return true;
    else
        return false;
    }
    public void push(int num,int stack_ID){
        if(stack_ID>=max_stack||stack_ID<0){
            System.out.println("No stack "+stack_ID);
            return;
        }
        else if(top[stack_ID]==max_size){
            System.out.println("stack "+stack_ID+" is full");
            return;
        }
        else
            arr[stack_ID][top[stack_ID]++]=num;
    }
    public int pop(int stack_ID){
        if(stack_ID>=max_stack||stack_ID<0){
            System.out.println("No stack "+stack_ID);
            return -1;
        }
        else if(IsEmpty(stack_ID)){
            System.out.println("stack "+stack_ID+" is empty");
            return -1;
        }
        else{
            int carry=arr[stack_ID][--top[stack_ID]];
            arr[stack_ID][top[stack_ID]]=0;
            return carry;
        }

    }
    public void print(){
        System.out.println("--------------------");
        for(int x=0;x<max_stack;x++){
            System.out.print("stack "+x+":");
            for(int y=top[x]-1;y>=0;y--){
                if(y!=0)
                    System.out.print(" "+arr[x][y]+",");
                else
                    System.out.print(" "+arr[x][y]);
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
    public MultipleStack(int in_max_stack,int in_max_size){
        max_stack=in_max_stack;max_size=in_max_size;
        arr=new int[max_stack][max_size];
        top=new int[max_stack];
        for(int x=0;x<in_max_stack;x++)
            top[x]=0;
    }
}