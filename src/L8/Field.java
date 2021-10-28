package L8;

import java.util.Arrays;
import static L8.Cell.*;

public class Field {
    private int size;
    private Cell[][] field;

    public Field() {
        size = 3;
        field = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(field[i], EMPTY);
        }
    }

    public boolean isEmpty(int x, int y) {
        return (field[x][y] == EMPTY);
    }

    public void showField(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (field[i][j]) {
                    case EMPTY:
                        System.out.print("|_|");
                        break;
                    case ZERO:
                        System.out.print("|O|");
                        break;
                    case CROSS:
                        System.out.print("|X|");
                        break;
                }
            }
            System.out.println();
        }
    }
    public Cell win() {
        for (int i = 0; i < field.length; i++) {
            // совпадение элементов в строке
            if (field[i][0].equals(field[i][1]) && field[i][1].equals(field[i][2]) && !field[i][2].equals(EMPTY)) {
                return field[i][0];
            }
            // совпадение элементов в столбце
            if (field[0][i].equals(field[1][i]) && field[1][i].equals(field[2][i]) && !field[2][i].equals(EMPTY)) {
                return field[0][i];
            }
        }
        if (field[0][0].equals(field[1][1]) && field[1][1].equals(field[2][2]) && !field[2][2].equals(EMPTY)) {
            return field[0][0];
        }
        if (field[0][2].equals(field[1][1]) && field[1][1].equals(field[2][0]) && !field[2][0].equals(EMPTY)) {
            return field[1][1];
        }
        return EMPTY;
    }

    public boolean draw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals(EMPTY)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean setValue(int x, int y, Cell pS) {
        if (isEmpty(x,y)) {
            field[x][y] = pS;
            return true;
        } else return false;
    }
}
