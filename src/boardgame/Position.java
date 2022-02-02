package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position() {
		
	}
	
	public Position(Integer row, Integer column) {
		setRow(row);
		setColumn(column);
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getRow());
		sb.append(", ");
		sb.append(getColumn());
		return sb.toString();
	}
	
}
