import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("введи значения");
        a = scan.nextInt();
        b = scan.nextInt();
        if ((a % b) == 0) {
            System.out.println(a + " делится без остатка на " + b);
        } else {
            System.out.println("Не делится");
        }

        int c = scan.nextInt();

        if (a > b && a > c) {
            System.out.println("MAX=" + a);
        } else if (b > a && b > c) {
            System.out.println("MAX=" + b);
        } else {
            System.out.println("MAX=" + c);
        }
    }

}
