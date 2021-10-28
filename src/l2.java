import java.util.Scanner;

public class l2 {
    public static void main(String[] args) {
      /*  int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("MAX A=" + a);
        } else {
            System.out.println("MAX B=" + b);
        }*/

      //calc
        System.out.println("ready for calc. input values and operand");
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        int res;
        String op = scan.next();
        if (op.equals("+")) {
            res = a1+a2;
            System.out.println(("sum="+res));
        } else if (op.equals("-")) {
            res = a1-a2;
            System.out.println("minus="+res);
        } else if (op.equals("*")) {
            res = a1*a2;
            System.out.println("mp="+res);
        } else if (op.equals("/")) {
            res = a1/a2;
            System.out.println("div="+res);
        }


    }
}
