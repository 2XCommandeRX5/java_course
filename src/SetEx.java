import java.util.ArrayList;
import java.util.HashSet;

public class SetEx {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains(2));

        int n = 100000;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            list.add(i);
        }

        hashSet = new HashSet<>(list);

        int k = 1000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            list.contains(n/2);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Arr time "+(finish-start));

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            hashSet.contains(n/2);
        }
        finish = System.currentTimeMillis();
        System.out.println("Hash time "+(finish-start));


    }
}
