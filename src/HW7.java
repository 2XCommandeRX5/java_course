import org.omg.CORBA.portable.ValueOutputStream;

public class HW7 {
    public static void main(String[] args) {
        //firstTask();
       // secTask(1,3,4);
        thirdTask(14,35);
        System.out.println(fourthTask(4, 18));
    }

    public static int fourthTask (int a, int b) {
        return a / thirdTask(a, b) * b;
    }

    public static int thirdTask(int a, int b) {
        while (a > 0 && b > 0) {
            if (a>b){
                a%=b;
            } else {
                b%=a;
            }
        }
        if (a==0) {
            return b;
        } else {
            return a;
        }
    }

    public static void firstTask() {
//        int n =10;
//        int res = 1;
//        for (int i = 1; i < n; i++) {
//            res *= i;
//        }
//        System.out.println(res);
//        int rec = fact(10);
//        System.out.println(rec);
        int vars = countVars(0,2,7, "");
        System.out.println(vars);
    }

    public static void secTask (int a, int b, int n) {
        int step = b - a;
        int res = a + step*(n-1);

        System.out.println(res);
    }

    public static int  countVars(int currentSum, int k, int n, String sumString) {
        System.out.println(sumString);
        if (currentSum == n) {
            System.out.println("success");
            return 1;
        }
        if (currentSum > n) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= k; i++) {
           sum+= countVars(currentSum + i, k, n, sumString+" + " + i);
        }
        return sum;
    }

    public static int fact (int n) {
        if (n ==1 || n==0) {
            return 1;
        }
        return n * fact(n-1);
    }
}

