package com.app.Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Juego {

	private static final boolean L = true; //LIVE
    private static final boolean D = false; //DEAD
    
	static final String CELL_LIVE_CHAR = "  * ";
    static final String CELL_DEAD_CHAR = "  - ";
    private static int LENGTH;
    static final Board bd = new Board();
    
    
    String boardStr = "";

    public Juego(){
    	
    	iniBoard();
    }
    
    
	public String getBoardStr() {
		
		//Se obtienen los datos a mostrar en la vista
		
		boardStr = "\n"; 
		
		boolean[][] board = bd.getActualBoard();
		
		for (int i = 0; i != LENGTH; i++) {
            for (int j = 0; j != LENGTH; j++) {
                boardStr += board[i][j] ? CELL_LIVE_CHAR : CELL_DEAD_CHAR;
            }
            boardStr += "\n";
        }
		
		 bd.nextStep();
		
		return boardStr;
	}

	public void setBoardStr(String boardStr) {
		this.boardStr = boardStr;
	}
    

    
    private void iniBoard() {

        boolean[][] initialBoard = {
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, L, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, L, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, L, L, L, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},            
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},
            {D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D, D},};

        LENGTH = initialBoard.length;
        
        bd.setBoardLength(LENGTH);
        bd.fillBoard(initialBoard);
    }
	
}
