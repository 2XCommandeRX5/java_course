import java.util.Random;
import java.util.regex.Pattern;

public class c1 {
    public static void main(String[] args) {
        int n = 10;
        Random rand = new Random();
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s = s + i;
        }
        System.out.println("s:"+s);
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("n!="+f);

        int m = 6;
        n=3;
        int r = 1;
        for (int i = 0; i < n ; i++) {
            r = r*m;
        }
        System.out.println("r:"+r);

        String pal = "abcba";
        boolean t = true;
        for (int i = 0; i < pal.length(); i++) {
            if (pal.charAt(i) == pal.charAt(pal.length()-1-i)) {
                continue;
            } else {
                t=false;
                break;
            }
        }
        if (t) {
            System.out.println(pal+" is pal");
        } else {
            System.out.println(pal+" is not pal");
        }

        String longNum = "23918740653240562345713245712353";
        int lastNum = longNum.charAt(longNum.length()-1);
        if (lastNum%3 == 0) {
            System.out.println("div");
        } else {
            System.out.println("no div");
        }

        String pat = "aasdfsadf";
        for (int i = 0; i < pat.length(); i++) {
            if (Pattern.matches("[a-z]",pat) == false) {
                System.out.println("no");
                break;
            }
        }

        //System.out.println(Pattern.matches("[a-z]",pat));

        int[] arr = new int[10];
    }
}
