import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        Scanner scan = new Scanner(System.in);

        int first = scan.nextInt();
        int second = scan.nextInt();
        int sum = first+second;
        System.out.println("sum = " + sum);

        String userName = scan.next();
        System.out.println("your name: "+userName);

    }
}
