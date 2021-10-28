import java.util.Scanner;

public class l2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val;
        System.out.println("input value:");
        val = scan.nextInt();
        if (val < -10) {
            System.out.println("left");
        } else if (val > -10 && val < 10) {
            System.out.println("center");
        } else if (val > 10) {
            System.out.println("right");
        }
    }
}
