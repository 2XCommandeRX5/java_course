import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class array2 {
    public static void main(String[] args) {
        int l = 1000000;
        Random rnd = new Random();
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = rnd.nextInt(10000);
        }

        int n = a.length;
        long start = System.currentTimeMillis();
        /*for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n -1 -i; j++) {
                if (a[j] >  a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }*/
        Arrays.sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
     //   System.out.println(Arrays.toString(a));
    }
}
