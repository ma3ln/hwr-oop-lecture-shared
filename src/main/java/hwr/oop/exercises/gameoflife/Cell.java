package hwr.oop.exercises.gameoflife;

public class Cell {
    Cell[][] floor;
    boolean alive;
    Cell(){
        this.floor = Field.floor;
    }
    public void markAlive() {
    }

    public boolean isAliveNextGeneration() {
        return true;
    }

    public Cell[] getNeighbours() {
        int k = -1;
        Position position = getPosition();
        Cell[] x = new Cell[8];
        Cell cell = floor[position.x][position.y];
        for (int i = 0; i <= position.x + 1; i++) {
            for (int j = 0; j <= position.y + 1; j++) {
                k = k + 1;
                Cell cells = floor[position.x][position.y];
                if (cell != cell){
                    x[k] = cells;
                }

            }
        }
        return x;
    }

    public boolean isAlive() {
        return true;
    }

    public boolean isDead() {
        return true;
    }

    public Position getPosition() {
        int y = Position.y;
        int x = Position.x;
        Position cellPosition = new Position(x,y);
        return cellPosition;
    }
}
