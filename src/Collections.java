import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.contains(1));
        list.remove(2);
        System.out.println(list);
        list.set(0,5);
        System.out.println(list);

        LinkedList<Integer> linkList = new LinkedList<>();
        int n = 100000;
        list.clear();
        for (int i = 0; i < n; i++) {
            list.add(i);
            linkList.add(i);
        }

        int k = 10000;
        long start = System.currentTimeMillis();

        for (int i = 0; i < k; i++) {
            list.set(i,i*i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Arr time "+(finish-start));

        start = System.currentTimeMillis();
        for (int i = 0; i <k ; i++) {
            linkList.set(n/2, i*i);
        }
        finish = System.currentTimeMillis();
        System.out.println("List time "+(finish-start));

        start = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            list.remove(0);
        }
        finish = System.currentTimeMillis();
        System.out.println("Arr time "+(finish-start));

        //-----------



    }
}
