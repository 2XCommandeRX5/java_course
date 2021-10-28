package L8;

import java.util.Arrays;
import java.util.Scanner;

public class crosss {
    public static String[][] table = new String[3][3];
    public static String s="x";

    public static void main(String[] args) {
        for (String[] r : table) {
            Arrays.fill(r, "_");
        }
        Scanner sc = new Scanner(System.in);

        while (true) {
            show();
            System.out.println("введи координаты " + s);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (!move(x, y, s)) {
                System.out.println("ячейка занята, давай ещё раз");
                continue;
            }
            if (win()) {
                System.out.println("winner is " + s);
                show();
                break;
            }
            if (draw()) {
                System.out.println("DRAW!");
                show();
                break;
            }
        }
        s = (s.equals("x")) ? "o" : "x";
    }

    public static boolean move(int x, int y, String s) {
        if (table[x][y].equals("_")) {
            table[x][y] = s;
            return true;
        } else return false;
    }

    public static boolean win() {
        if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2]) && !table[2][2].equals("_")) {
            return true;
        }
        if (table[0][2].equals(table[1][1]) && table[1][1].equals(table[2][0]) && !table[2][0].equals("_")) {
            return true;
        }
        for (int i = 0; i < table.length; i++) {
            //rows
            if (table[i][0].equals(table[i][1]) && table[i][1].equals(table[i][2]) && !table[i][2].equals("_")) {
                return true;
            }
            //cols
            if (table[0][i].equals(table[1][i]) && table[1][i].equals(table[2][i]) && !table[2][i].equals("_")) {
                return true;
            }
        }
        return false;
    }

    public static void show() {
        for (String[] r : table) {
            System.out.println(Arrays.toString(r));
        }
    }

    public static boolean draw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j].equals("_")) {
                    return false;
                }
            }
        }
        return true;
    }

}
