package L8;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public abstract class Player {
    private Cell team;

    public Player(Cell team) {
        this.team = team;
    }

    public Cell getTeam() {
        return team;
    }

    public abstract Point turn(Field f);

}

class HumanPlayer extends Player {

    public HumanPlayer(Cell team) {
        super(team);
    }

    @Override
    public Point turn(Field f) {
        f.showField();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        return new Point(x, y);
    }

}

class CompPlayer extends Player {

    public CompPlayer(Cell team) {
        super(team);
    }

    @Override
    public Point turn(Field f) {
        f.showField();
        Random rnd = new Random();
        int res = rnd.nextInt(9);
        int row = res / 3;
        int col = res % 3;
        return new Point(row, col);
    }
}