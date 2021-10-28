package L13;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasExample {
    public static void main(String[] args) throws InterruptedException {
        Thread sampleT = new Thread(
                () -> {
                    System.out.println("Thread action");
                    System.out.println("End thread");
                }
        );
        sampleT.start();
        sampleT.join();

        Consumer<Integer> doublePrinter = integer -> {
            integer *= 2;
            System.out.println("aa"+integer);
        };
        doublePrinter.accept(12);

        BiConsumer<Integer, Integer> pow = (a, b) -> System.out.println("Pow" + Math.pow(a,b));
        pow.accept(2,10);

        Supplier<String> namePrinter = () -> "Hello, mr. Robot";
        System.out.println(namePrinter.get());

        Function<String, Integer> countUpCase = s -> {
            int n = 0;
            for (char c : s.toCharArray())
                if (Character.isUpperCase(c)) n++;
            return n;
        };
        System.out.println("Upper case syms:" + countUpCase.apply("Hail Hydra!"));


    }
}
