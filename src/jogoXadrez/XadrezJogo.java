
package jogoXadrez;

import jogoTabuleiro.Tabuleiro;

public class XadrezJogo {

    private Tabuleiro tabuleiro;    
    
    public XadrezJogo() {
        tabuleiro = new Tabuleiro(8,8);
    }
    
    public XadrezPeca[][] getPieces() {
		XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (XadrezPeca) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
    
}
