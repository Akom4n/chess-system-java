package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		//Position como null apenas para fins didaticos, pois java por padrão quando não declarado torna nulo
		position = null;
	}

	//Tabuleiro como protegido pois é apenas para uso interno do chess. 
	protected Board getBoard() {
		return board;
	}


}
