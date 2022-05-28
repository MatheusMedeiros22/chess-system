package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padr�o, o java ja coloca o null 
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
