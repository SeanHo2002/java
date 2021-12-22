
/*
           檔名: hw1130_2.java
           功能: 類別OrderedList
           作者: 資工二甲 何擎 40943113
           日期: 2021/11/30
           版本: 1.0
*/

public class hw1130_2 {
    public static void main(String args[]) {
        OrderedList a = new OrderedList();
        OrderedList b = new OrderedList();
        int r;
        for (int x = 0; x < 10; x++) {
            r = (int) (Math.random() * 10) + 1;
            a.add(r);
            r = (int) (Math.random() * 10) + 1;
            b.add(r);
        }
        System.out.print("a:");
        a.print();
        System.out.print("b:");
        b.print();
        if (a.find(5) == -1)
            System.out.println("not found 5 in a");
        else
            System.out.println("5's locate in a:" + a.find(5));
        if (b.find(5) == -1)
            System.out.println("not found 5 in b");
        else
            System.out.println("5's locate in b:" + b.find(5));
        a = a.merge(b);
        a.print();
    }
}

class OrderedList {
    private int[] data = new int[100];
    private int now = 0;

    public OrderedList() {
    }

    public void add(int item) {
        data[now] = item;
        now++;
        sort();
    }

    public void print() {
        System.out.print("[");
        for (int x = 0; x < now; x++) {
            System.out.print(data[x]);
            if (x != now - 1)
                System.out.print(",");
        }
        System.out.print("]\n");
    }

    public int find(int item) {
        for (int x = 0; x < now; x++) {
            if (data[x] == item)
                return x;
        }
        return -1;
    }

    public void remove(int item) {
        int[] carry = new int[100];
        int locate = find(item);
        if (locate == -1)
            System.out.println("not found");
        else {
            for (int x = 0; x < locate; x++)
                carry[x] = data[x];
            for (int x = locate; x < now - 1; x++)
                carry[x] = data[x + 1];
            for (int x = 0; x < now - 1; x++)
                data[x] = carry[x];
            now--;
            sort();
        }
    }

    public OrderedList merge(OrderedList oL) {
        OrderedList re = new OrderedList();
        for (int x = 0; x < now; x++)
            re.add(data[x]);
        for (int x = 0; x < oL.now; x++)
            re.add(oL.data[x]);
        return re;
    }

    public void sort() {
        for (int x = 0; x < now; x++)
            for (int y = x; y < now; y++)
                if (data[x] > data[y]) {
                    int carry = data[x];
                    data[x] = data[y];
                    data[y] = carry;
                }
    }
}