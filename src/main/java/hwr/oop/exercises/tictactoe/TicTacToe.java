package hwr.oop.exercises.tictactoe;


class TicTacToe {

    int [][] spielfeld = new int[3][3];
    boolean xZug = true;
    boolean yZug = true;
    int xPunkte = 0;
    int yPunkte = 0;

    TicTacToe() {
        System.out.println("Punktestand: "+ xPunkte+" : "+yPunkte);
        spielfeld = new int[3][3];
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
        if(isGameOver()){
            yPunkte += yPunkte;
            new TicTacToe();
            throw new RuntimeException("Circle won");
        }
        if (xZug && getValueAt(x,y) != 1 && getValueAt(x,y) != 2){
            spielfeld[x][y] = 1;
            xZug = false;
            yZug = true;
        }else{
            throw new RuntimeException("Andere Spieler ist dran.");
        }

    }

    void setCircle(int x, int y) {
        if(isGameOver()){
            xPunkte += xPunkte;
            new TicTacToe();
            throw new RuntimeException("Cross won");
        }
        if (yZug && getValueAt(x,y) != 1 && getValueAt(x,y) != 2){
            spielfeld[x][y] = 2;
            xZug = true;
            yZug = false;
        }else{
            throw new RuntimeException("Andere Spieler ist dran.");
        }


    }

    boolean isGameOver() {
        for (int i = 0; i < 3; i++) {
            if(getValueAt(i,0)== 1 && getValueAt(i,1)== 1 && getValueAt(i,2)==1){
                return true;
            }
            if(getValueAt(i,0)== 2 && getValueAt(i,1)== 2 && getValueAt(i,2)==2){
                return true;
            }
            if(getValueAt(0,i)== 1 && getValueAt(1,i)==1 && getValueAt(2,i)==1 ){
                return true;
            }
            if(getValueAt(0,i)== 2 && getValueAt(1,i) == 2 && getValueAt(2,i)==2 ){
                return true;
            }
        }
        if(getValueAt(1,1)==1 && getValueAt(0,0)== 1 && getValueAt(2,2)== 1){
            return true;
        }
        if(getValueAt(1,1)==1 && getValueAt(0,2)==1 && getValueAt(2,0)==1){
            return true;
        }
        if(getValueAt(1,1)==2 && getValueAt(0,0)== 2 && getValueAt(2,2)== 2){
            return true;
        }
        if(getValueAt(1,1)==2 && getValueAt(0,2)==2 && getValueAt(2,0)==2){
            return true;
        }
        return false;
    }

}
