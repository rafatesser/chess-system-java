package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
		
	}
	
	public Piece(Board board) {
		setBoard(board);
		position = null;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	private void setBoard(Board board) {
		this.board = board;
	}
	
	protected Board getBoard() {
		return board;
	}
}
