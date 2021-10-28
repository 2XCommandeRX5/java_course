package L12;

import java.lang.annotation.Native;

public class HW8 {
    public static void main(String[] args) {
        Fraction oneHalf = new Fraction(1,2);
        Fraction quater = new Fraction(1,4);
        Fraction one = new Fraction(1,1);
        Fraction res = oneHalf.plus(quater).plus(one).simplyfy();
        System.out.println(res.getA()+"/"+res.getB());
    }
}

class Fraction {
    private int a;
    private int b;

    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Fraction plus (Fraction arg) {
        int a = this.a * arg.b + arg.a*this.b;
        int b = this.b * arg.b;
        return new Fraction(a,b);
    }

    public Fraction minus (Fraction arg) {
        int a = this.a * arg.b - arg.a * this.b;
        int b = this.b * arg.b;
        return new Fraction(a, b);
    }

    public Fraction simplyfy() {
        int curA = Math.abs(a);
        int curB = Math.abs(b);
        while (curA > 0 && curB > 0) {
            if (curA>curB) curA-=curB;
            else curB -=curA;
        }
        int gcd = Math.max(curA,curB);
        return new Fraction(a/gcd,b/gcd);
    }

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Fraction) {
            Fraction second = (Fraction) obj;
            return a == second.a && b == second.b;
        }
        return false;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}