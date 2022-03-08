package boardgame;

import modal.exception.BoardException;

public class Board {
	
	private Integer row;
	private Integer column;
	private Piece piece[][];
	
	public Board() {
		
	}
	
	public Board(Integer row, Integer column) {
		if (row < 1 || column < 1) {
			throw new BoardException("Error creation board: there must be at least 1 row and 1 column");
		}
		setRow(row);
		setColumn(column);
		piece = new Piece[row][column];
	}

	public Integer getRow() {
		return row;
	}

	private void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	private void setColumn(Integer column) {
		this.column = column;
	}
	
	public Piece piece(Integer row, Integer column) {	
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board.");
		}
		return piece[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return piece[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if(thereIsaPiece(position)) {
			throw new BoardException("There exist a piece in the position");
		}
		this.piece[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < this.row && column >= 0 && column < this.column;
	}
	
	public boolean positionExists(Position position) {
		return this.positionExists(position.getRow(), position.getColumn());
		
	}
	
	public boolean thereIsaPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return piece(position) != null;
	}

}
