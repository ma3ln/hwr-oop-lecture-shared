package hwr.oop.exercises.gameoflife;

public class Position {
    static int x;
    static int y;

    Position(int x, int y){
        this.x = x;
        this.y = y;

    }

    public boolean isNextTo(Position neighbour) {
        for (int x = this.x-1; x < this.x++; x++) {
            for (int y = this.y-1; y < this.y++; y++) {
                if (neighbour.x == this.x-x && neighbour.y == this.y-y){
                    return true;
                }
            }
        }
        return false;
    }
}
