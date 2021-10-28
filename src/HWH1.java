public class HWH1 {
    public static void main(String[] args) {
        System.out.println("Hello, F World!");
        System.out.println("Heil Russia");
        int a = 5;
        int b = 7;
        int c = 0;
        int sum = a + b + 12;
        int div = b / a;
        int mod = b % a;

        System.out.println(mod + " " + div);

        double price = 999.99;
        double discount = 0.9;
        double finalPrice = price * discount;
        System.out.println("fp=" + finalPrice);

        String name = "YW";
        String textToPrint = "My name is "+name;
        System.out.println(textToPrint);
        int numOfChars = textToPrint.length();
        System.out.println("str length = " + numOfChars);

        char firstSymbol = name.charAt(0);
        System.out.println(firstSymbol);
        char lastSymbol = name.charAt(name.length()-1);
        System.out.println(lastSymbol);

        String substr = textToPrint.substring(5);
        System.out.println(substr);
        String substr2 = textToPrint.substring(2,8);
        System.out.println(substr2);

    }
}

