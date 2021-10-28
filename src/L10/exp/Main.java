package L10.exp;

public class Main {
    public static void main(String[] args) {
        Executable number2 = new Number(2);
        Executable number5 = new Number(5);

        Executable ops = new Operation('+',number2, number5);
        Executable num4 = new Number(4);
        Executable ops2 = new Operation('-',ops,num4);
        //Executable result = null;
        System.out.println(ops2.execute());
    }
}
