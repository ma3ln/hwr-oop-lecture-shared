package hwr.oop.exercises.tictactoe;


class TicTacToe {

    int [][] spielfeld = new int[3][3];
    boolean xZug = true;
    boolean yZug = true;

    TicTacToe() {
        // TODO implement!
    }

    int getValueAt(int x, int y) {
        int value = 0;
        try {
            value = spielfeld[x][y];
            return value;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return value;
    }

    void setCross(int x, int y) {
        if (xZug == true && getValueAt(x,y) != 1 && getValueAt(x,y) != 2){
            spielfeld[x][y] = 1;
            xZug = false;
            yZug = true;
        }else{
            throw new RuntimeException("Andere Spieler ist dran.");
        }
        if(isGameOver()){
            throw new RuntimeException("Cross won");
        }
    }

    void setCircle(int x, int y) {
        if (yZug == true && getValueAt(x,y) != 1 && getValueAt(x,y) != 2){
            spielfeld[x][y] = 2;
            xZug = true;
            yZug = false;
        }else{
            throw new RuntimeException("Andere Spieler ist dran.");
        }
        if(isGameOver()){
            throw new RuntimeException("Circle won");
        }

    }

    boolean isGameOver() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (spielfeld[i][j] == 0) {
                    return false;
                }
                if(spielfeld[i][j] == 1){
                    if(i == 1 && j == 1){
                        if(getValueAt(i --,j--) == 1 && getValueAt(i++, j++) == 1){
                            return true;
                        }
                        if(getValueAt(i --,j++) == 1 && getValueAt(i++, j--) == 1){
                            return true;
                        }
                    }
                    if(getValueAt(i ,j--) == 1 && getValueAt(i, j++) == 1 && j == 1){
                        return true;
                    }
                    if ((getValueAt(i --,j) == 1 && getValueAt(i++, j) == 1) && i == 1){
                        return true;
                    }
                }
                if(spielfeld[i][j] == 2) {
                    if (i == 1 && j == 1) {
                        if (getValueAt(i--, j--) == 2 && getValueAt(i++, j++) == 2) {
                            return true;
                        }
                        if (getValueAt(i--, j++) == 2 && getValueAt(i++, j--) == 2) {
                            return true;
                        }
                    }
                    if (getValueAt(i, j--) == 2 && getValueAt(i, j++) == 2 && j == 1) {
                        return true;
                    }
                    if ((getValueAt(i--, j) == 2 && getValueAt(i++, j) == 2) && i == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
