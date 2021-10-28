package L9;

public class Polymorph {
    public static void main(String[] args) {
        Animal pm = new Animal();
        System.out.println(pm);
    }
}

class Animal {
    @Override
    public String toString() {
        return "Animal";
    }
}