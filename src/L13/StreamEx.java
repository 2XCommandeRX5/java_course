package L13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class StreamEx {
    public static void main(String[] args) {
        Random r = new Random();
        long Dval = r.ints(100,0,100)
                .map(value -> value%10)
                .filter(value -> value > 5)
                .distinct()
                .count();
//                .forEach(System.out::println);
        System.out.println(Dval);
        List<String> names = new ArrayList<>();
        names.add("Assa");
        names.add("Beta");
        names.add("Charlie");

        long dc = names.stream()
                .map(String::toLowerCase)
                .flatMapToInt(value -> value.chars())
                .distinct()
                .count();
        System.out.println(dc);
    }
}
