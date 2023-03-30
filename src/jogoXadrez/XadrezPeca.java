
package jogoXadrez;


import jogoTabuleiro.Peca;
import jogoTabuleiro.Tabuleiro;


public class XadrezPeca extends Peca {
    
    private Cor cor;
 
    public XadrezPeca(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }
    
    public Cor getCor() {
        return cor;
    }
    
	
	
}
