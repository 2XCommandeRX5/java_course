import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
