package chess;

import boardGame.Position;

public class ChessPosition {
	
	private char collumn;
	private int row;
	
	
	public ChessPosition(char collumn, int row) {
		if(collumn < 'a' || collumn > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.collumn = collumn;
		this.row = row;
	}


	public char getCollumn() {
		return collumn;
	}


	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, collumn - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getCollumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + collumn + row;
	}
}
