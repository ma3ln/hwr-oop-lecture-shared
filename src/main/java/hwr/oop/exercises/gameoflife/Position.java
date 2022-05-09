package hwr.oop.exercises.gameoflife;

public class Position {
    int x,y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isNextTo(Position neighbour) {
        return false;
    }
}
