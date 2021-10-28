package L9;

import org.w3c.dom.events.MouseEvent;

import java.util.ArrayList;
import java.util.Arrays;

public class InterfaceWx {
    public static void main(String[] args) {
        Element a = new Element();
        Element b = new Element();
        if (a.compareTo(b) > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        ArrayList<Moveable> obj = new ArrayList<>();
        obj.add(new Ball());
        obj.add(new Square());
        obj.get(0).move();

        for (Moveable o : obj) {
            o.rotate();
        }

    }
}

interface Moveable {
    void move();
    void rotate();
    void spin();
}

class Ball implements Moveable {
    @Override
    public void move() {
        System.out.println("ball moved");
    }

    @Override
    public void rotate() {
        System.out.println("ball rotated");
    }

    @Override
    public void spin() {
        System.out.println("ball spinned");
    }
}

class Square implements Moveable {
    @Override
    public void move() {
        System.out.println("sq moved");
    }

    @Override
    public void rotate() {
        System.out.println("sq rotated");
    }

    @Override
    public void spin() {
        System.out.println("sq spinned");
    }
}

class Element implements Comparable<Element> {
    int value;
    @Override
    public int compareTo(Element o) {
        if (value > o.value) return 1;
        else return -1;
    }
}