package boardgame;

public abstract class  Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {//cria uma peça
		this.board = board;
		position = null;//posição de um peça recém priado
	}

	protected Board getBoard() {// uso interno da camada de tabuleiro
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i < mat.length; i++) {
			for(int j =0; j < mat.length;j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	

	
}
