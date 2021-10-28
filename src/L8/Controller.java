package L8;

import java.awt.*;

import static L8.Cell.*;

public class Controller {
    public void startGame() {
        Player cross = new HumanPlayer(CROSS);
        Player zero = new CompPlayer(ZERO);
        Field f = new Field();
        Player currentPlayer = cross;

        while (!f.draw()) {
                Point coords =currentPlayer.turn(f);

            if (!f.setValue(coords.x, coords.y, currentPlayer.getTeam())) {
                System.out.println("Try again");
                continue;
            }
            Cell win = f.win();
            if (win != EMPTY) {
                System.out.println("and the winner is " + win);
                f.showField();
                break;
            }
           currentPlayer = ((currentPlayer == cross) ? zero : cross);
        }
        if (f.draw()) System.out.println("DRAW");
    }
}
