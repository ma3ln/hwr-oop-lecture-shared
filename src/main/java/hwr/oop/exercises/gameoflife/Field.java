package hwr.oop.exercises.gameoflife;

public class Field {
    Position[][] posi;
    Cell[][] spielfeld;
    public Field(int size) {
        posi = new Position[size][size];
        spielfeld = new Cell[size][size];
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                Position position = new Position(i,j);
                posi[i][j] = position;
                spielfeld[i][j] = new Cell(position, size);
            }
        }
    }

    public static Cell getCellAt(Position centerPosition) {
        return null;
    }
}
