/*
           檔名: hw1206_1.java
           功能: stack
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/06
           版本: 1.0
*/
public class hw1206_1 {
    public static void main(String args[]) {
        MyStack test = new MyStack();
        for (int x = 0; x < 20; x++) {
            System.out.print("Push(" + x + "):");
            test.Push(x);
            test.print();
        }
        for (int x = 0; x < 21; x++) {
            System.out.print("Pop():");
            test.Pop();
            test.print();
        }
        for (int x = 0; x < 10; x++) {
            System.out.print("Push(" + x + "):");
            test.Push(x);
            test.print();
        }
        for (int x = 0; x < 5; x++) {
            System.out.print("Pop():");
            test.Pop();
            test.print();
        }
        for (int x = 0; x < 5; x++) {
            System.out.print("Push(" + x + "):");
            test.Push(x);
            test.print();
        }
        for (int x = 0; x < 3; x++) {
            System.out.print("Pop():");
            test.Pop();
            test.print();
        }
    }
}

class MyStack {
    private int top;
    private int capacity;
    private int[] arr;

    public MyStack() {
        capacity = 10;
        top = 0;
        arr = new int[capacity];
    }

    public boolean IsEmpty() {
        if (top != 0)
            return false;
        else
            return true;
    }

    public int Size() {
        return top;
    }

    public int Top() {
        if (IsEmpty())
            return -1;
        else
            return arr[top - 1];
    }

    public void Push(int num) {
        if (top == capacity) {
            capacity *= 2;
            int[] carry = new int[capacity];
            for (int x = 0; x < top; x++)
                carry[x] = arr[x];
            arr = carry;
        }
        arr[top++] = num;
    }

    public void Pop() {
        if (IsEmpty())
            System.out.println("Stack is Empty!!");
        else {
            top--;
            int[] carry = new int[capacity];
            for (int x = 0; x < top; x++)
                carry[x] = arr[x];
            arr = carry;
        }
    }

    public void print() {
        System.out.print("[");
        for (int x = 0; x < top; x++) {
            if (x == top - 1)
                System.out.print(arr[x]);
            else
                System.out.print(arr[x] + ",");
        }
        System.out.println("]");
    }
}
