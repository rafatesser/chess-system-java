package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;
	private Integer moveCount;
	
	public ChessPiece(Board board, Color color, Integer moveCount) {
		super(board);
		setColor(color);
		setMoveCount(moveCount);
	}

	public Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	public Integer getMoveCount() {
		return moveCount;
	}

	public void setMoveCount(Integer moveCount) {
		this.moveCount = moveCount;
	}
	
	
	
}
