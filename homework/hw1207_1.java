/*
           檔名: hw1207_1.java
           功能: 複數類別
           作者: 資工二甲 何擎 40943113
           日期: 2021/12/07
           版本: 1.0
*/
public class hw1207_1 {
    public static void main(String args[]) {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex c = a.add(b);
        Complex d = c.sub(a);
        Complex e = a.multiply(b);
        Complex f = a.div(b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("a+b=" + c);
        System.out.println("c-a=" + d);
        System.out.println("a*b=" + e);
        System.out.println("a/b=" + f);
    }
}

class Complex {
    private double x = 0;
    private double y = 0;

    public Complex(double in_x, double in_y) {
        x = in_x;
        y = in_y;
    }

    public Complex add(Complex in) {
        Complex re = new Complex(0, 0);
        re.x = this.x + in.x;
        re.y = this.y + in.y;
        return re;
    }

    public Complex sub(Complex in) {
        Complex re = new Complex(0, 0);
        re.x = this.x - in.x;
        re.y = this.y - in.y;
        return re;
    }

    public Complex multiply(Complex in) {
        Complex re = new Complex(0, 0);
        re.x = (this.x * in.x) - (this.y * in.y);
        re.y = (this.x * in.y) + (this.y * in.x);
        return re;
    }

    public Complex div(Complex in) {
        Complex re = new Complex(0, 0);
        re.x = ((this.x * in.x) + (this.y * in.y)) / (Math.pow(in.x, 2) + Math.pow(in.y, 2));
        re.y = ((this.y * in.x) - (this.x * in.y)) / (Math.pow(in.x, 2) + Math.pow(in.y, 2));
        return re;
    }

    @Override
    public String toString() {
        String re = x + "+" + y + "i";
        return re;
    }
}