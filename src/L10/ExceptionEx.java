package L10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionEx {

  static class LocationNotFoundException extends RuntimeException {
        private String locationName;

        public LocationNotFoundException(String locationName) {
            super(locationName);
            this.locationName = locationName;
        }

        @Override
        public String getMessage() {
            return "Location " + locationName + " not found ";
        }
    }

    public static void main(String[] args) {

        throw new LocationNotFoundException("asd");

            //calc();


    }
    static void calc()  {
        try {
            divide();
        } catch (Exception e) {
            System.out.println("error na " + e);
            //System.out.println(e.getMessage());
           // e.printStackTrace();
        }
        Scanner sc = null;
        try {
           sc = new Scanner((new File("input.txt")));
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            if (sc != null){sc.close();}
        }
    }

    static void divide (){
        int[] a = new int[1];
        System.out.println(a[-1]);
    }

}

