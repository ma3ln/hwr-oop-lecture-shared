package hwr.oop.exercises.gameoflife;

public class Cell {

    private final Position position;
    int fieldsize;

    Cell(Position position, int fieldsize){
        this.position = position;
        this.fieldsize = fieldsize-1;
    }

    public Cell[] getNeighbours() {
        Cell[] neighbours;
        if(position.x == 0 && position.y == 0){
            neighbours = new Cell[3];
            neighbours[0] = Field.getCellAt(new Position(1,0));
            neighbours[1] = Field.getCellAt(new Position(1,1));
            neighbours[2] = Field.getCellAt(new Position(0,1));
        } else if (position.x == fieldsize && position.y == fieldsize) {
            neighbours = new Cell[3];
            neighbours[0] = Field.getCellAt(new Position(fieldsize -1,fieldsize -1));
            neighbours[1] = Field.getCellAt(new Position(fieldsize -1,fieldsize));
            neighbours[2] = Field.getCellAt(new Position(fieldsize,fieldsize -1));

        } else if (position.x == 0 && position.y == fieldsize) {
            neighbours = new Cell[3];
            neighbours[0] = Field.getCellAt(new Position(0,fieldsize -1));
            neighbours[1] = Field.getCellAt(new Position(1,fieldsize -1));
            neighbours[2] = Field.getCellAt(new Position(1,fieldsize));
        } else if (position.x == fieldsize && position.y == 0) {
            neighbours = new Cell[3];
            neighbours[0] = Field.getCellAt(new Position(fieldsize -1,0));
            neighbours[1] = Field.getCellAt(new Position(fieldsize -1,1));
            neighbours[2] = Field.getCellAt(new Position(fieldsize,1));
        } else if (position.x == 0) {
            neighbours = new Cell[5];
            neighbours[0] = Field.getCellAt(new Position(0, position.y-1));
            neighbours[1] = Field.getCellAt(new Position(0, position.y+1));
            neighbours[2] = Field.getCellAt(new Position(1, position.y-1));
            neighbours[3] = Field.getCellAt(new Position(1, position.y));
            neighbours[4] = Field.getCellAt(new Position(1, position.y+1));
        } else if (position.y == 0) {
            neighbours = new Cell[5];
            neighbours[0] = Field.getCellAt(new Position(position.x-1, 0));
            neighbours[1] = Field.getCellAt(new Position(position.x+1, 0));
            neighbours[2] = Field.getCellAt(new Position(position.x-1, 1));
            neighbours[3] = Field.getCellAt(new Position(position.x, 1));
            neighbours[4] = Field.getCellAt(new Position(position.x-1, 1));
        } else if (position.x == fieldsize) {
            neighbours = new Cell[5];
            neighbours[0] = Field.getCellAt(new Position(position.x-1, position.y+1));
            neighbours[1] = Field.getCellAt(new Position(position.x+1, position.y-1));
            neighbours[2] = Field.getCellAt(new Position(position.x -1, position.y+1));
            neighbours[3] = Field.getCellAt(new Position(position.x, position.y));
            neighbours[4] = Field.getCellAt(new Position(position.x+1, position.y));
        } else if (position.y == fieldsize) {
            neighbours = new Cell[5];
            neighbours[0] = Field.getCellAt(new Position(0, position.y-1));
            neighbours[1] = Field.getCellAt(new Position(0, position.y));
            neighbours[2] = Field.getCellAt(new Position(0, position.y+1));
            neighbours[3] = Field.getCellAt(new Position(1, position.y-1));
            neighbours[4] = Field.getCellAt(new Position(1, position.y));
        } else{
            neighbours = new Cell[8];
        }

        return neighbours;
    }

    public Position getPosition() {
        return position;
    }

    public void markAlive() {

    }

    public boolean isAlive() {
        return false;
    }

    public boolean isDead() {
        return false;
    }

    public boolean isAliveNextGeneration() {
            return false;
    }
}
