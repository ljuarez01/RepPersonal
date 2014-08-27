package com.app.Controller;

public class Board {

    
    private static boolean[][] BOARD;
    private static int LENGTH;

   
    protected boolean[] getNeighboursByCell(int x, int y) {
        
    	int length = LENGTH - 1;

        if (x == 0 && y == 0) {
            return setNeighboursValues(length, 0, 1, length, 0, 1);
        }

        if (x == 0 && y == length) {
            return setNeighboursValues(length, 0, 1, length - 1, length, 0);
        }

        if (x == length && y == 0) {
            return setNeighboursValues(length - 1, length, 0, length, 0, 1);
        }

        if (x == length && y == length) {
            return setNeighboursValues(length - 1, length, 0, length - 1, length, 0);
        }

        if (x > 0 && x < length && y == 0) {
            return setNeighboursValues(x - 1, x, x + 1, length, 0, 1);
        }

        if (x > 0 && x < length && y == length) {
            return setNeighboursValues(x - 1, x, x + 1, length - 1, length, 0);
        }

        if (x == length && y > 0 && y < length) {
            return setNeighboursValues(length - 1, length, 0, y - 1, y, y + 1);
        }

        if (x == 0 && y > 0 && y < length) {
            return setNeighboursValues(length, x, x + 1, y - 1, y, y + 1);
        }
        
        return setNeighboursValues(x - 1, x, x + 1, y - 1, y, y + 1);
    }

    
    private boolean[] setNeighboursValues(
            int sec0, int sec1, int sec2,
            int pos0, int pos1, int pos2) {

        int boardSize = 9;
        
        boolean[] neighbours = new boolean[boardSize];
        
        neighbours[0] = BOARD[sec0][pos0];
        neighbours[1] = BOARD[sec0][pos1];
        neighbours[2] = BOARD[sec0][pos2];

        neighbours[3] = BOARD[sec1][pos0];
        neighbours[4] = BOARD[sec1][pos1];
        neighbours[5] = BOARD[sec1][pos2];

        neighbours[6] = BOARD[sec2][pos0];
        neighbours[7] = BOARD[sec2][pos1];
        neighbours[8] = BOARD[sec2][pos2];
        
        return neighbours;
    }
    
    public void nextStep() {
    	
        boolean[][] nextBoard = new boolean[LENGTH][LENGTH];
        for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                Cell cell = new Cell();
                boolean[] neighbours = this.getNeighboursByCell(i, j);
                nextBoard[i][j] = cell.getCellHealth(neighbours);
            }
        }
        
        BOARD = nextBoard;
    }

    public void setBoardLength(int length) {
        LENGTH = length;
        BOARD = new boolean[LENGTH][LENGTH];
    }

    public void fillBoard(boolean[][] board) {
        BOARD = board;
    }

    public boolean[][] getActualBoard() {
        return BOARD;
    }
}
