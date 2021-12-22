/*
           檔名: hw1206_2.java
           功能: queue
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/06
           版本: 1.0
*/
public class hw1206_2 {
    public static void main(String args[]) {
        MyQueue test = new MyQueue();
        for (int x = 0; x < 20; x++) {
            System.out.print("Add(" + x + "):");
            test.Add(x);
            test.print();
        }
        for (int x = 0; x < 21; x++) {
            System.out.print("Remove():");
            test.Remove();
            test.print();
        }
        for (int x = 0; x < 10; x++) {
            System.out.print("Add(" + x + "):");
            test.Add(x);
            test.print();
        }
        for (int x = 0; x < 5; x++) {
            System.out.print("Remove():");
            test.Remove();
            test.print();
        }
        for (int x = 0; x < 5; x++) {
            System.out.print("Add(" + x + "):");
            test.Add(x);
            test.print();
        }
        for (int x = 0; x < 3; x++) {
            System.out.print("Remove():");
            test.Remove();
            test.print();
        }
    }
}

class MyQueue {
    private int[] arr;
    private int capacity, front, rear;

    public MyQueue() {
        capacity = 5;
        front = 0;
        rear = -1;
        arr = new int[capacity];
    }

    public boolean IsEmpty() {
        if (front - 1 == rear)
            return true;
        else
            return false;
    }

    public void Add(int num) {
        rear++;
        if (rear == capacity) {
            capacity *= 2;
            int[] carry = new int[capacity];
            for (int x = 0; x < rear; x++)
                carry[x] = arr[x];
            arr = carry;
        }
        arr[rear] = num;
    }

    public void Remove() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty!!");
        } else {
            front++;
            int[] carry = new int[capacity];
            for (int x = front; x <= rear; x++)
                carry[x] = arr[x];
            arr = carry;
        }
    }

    public void print() {
        // System.out.print("f:" + front + ",r:" + rear + ",");
        System.out.print("[");
        for (int x = front; x <= rear; x++) {
            if (x == rear)
                System.out.print(arr[x]);
            else
                System.out.print(arr[x] + ",");
        }
        System.out.println("]");
    }
}
