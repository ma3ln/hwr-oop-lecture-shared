package hwr.oop.exercises.gameoflife;

public class Field {
    Position[] positions;
    Cell[] cells;
    int size;
    static Cell[][] floor;
    Field(int size){
        this.size = size;
        this.floor = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.floor [i][j] = new Cell();
            }

        }
    }
    Cell getCellAt(Position centerPosition){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = floor [i][j];
                Position getCenterPosition = cell.getPosition();
                if (getCenterPosition.x == centerPosition.x && getCenterPosition.y == centerPosition.y){
                    return cell;
                }
            }
        }
        throw new RuntimeException("Failed to Build Array");
        }
}
