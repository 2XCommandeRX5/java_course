import java.util.Scanner;

public class calc {
public static boolean check(String arg) {
    return arg.equalsIgnoreCase("exit");
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cur = 0;
    for (; ; ) {
        String ns = sc.next();
        if (check(ns)) {
            break;
        }
        int num = Integer.valueOf(ns);
        String op = sc.next();
        if (check(ns)) {
            break;
        }
        switch (op) {
            case "+": {
                cur += num;
                break;
            }
            case "-": {
                cur -= num;
                break;
            }
        }
        System.out.println(cur);
    }
}
}
