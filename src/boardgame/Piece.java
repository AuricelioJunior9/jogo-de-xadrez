package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {//cria uma peça
		this.board = board;
		position = null;//posição de um peça recém priado
	}

	protected Board getBoard() {// uso interno da camada de tabuleiro
		return board;
	}
	
	

	
}
