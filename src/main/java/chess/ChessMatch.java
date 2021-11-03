package chess;

import boardgame.Board;

// coração do nosso sistema de xadrez
public class ChessMatch {

    private Board board;

    public ChessMatch() {
        // quem deve saber a dimensão do tabuleiro de xadrez é a classe ChessMatch, aqui que vamos definir que ele vai ser 8x8
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        // eu vou percorrer a matriz de peças do tabuleiro (board) e para cada peça do meu tabuleiro eu vou fazer um dowcasting pra ChessPiece
        for (int i=0; i < board.getRows(); i++) {
            for(int j=0; j < board.getColumns(); j++ ) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
