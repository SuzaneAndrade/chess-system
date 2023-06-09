
package jogoTabuleiro;


public class Tabuleiro {
    
    private int linhas;
    private int colunas;
    private Peca[][] peca;

    public Tabuleiro() {
    }

    public Tabuleiro(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        peca = new Peca[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    
    public Peca peca(int linha, int coluna) {
		//if (!positionExists(linha, coluna)) {
			//throw new BoardException("Position not on the board");
		//}
		return peca[linha][coluna];
	}
    
    
    
    
    
}
