
package tabuleiro;


public class Posicao {
    
    private int Linha;
    private int Coluna;

    public Posicao(Integer Linha, Integer Coluna) {
        this.Linha = Linha;
        this.Coluna = Coluna;
    }

    public Integer getLinha() {
        return Linha;
    }

    public void setLinha(Integer Linha) {
        this.Linha = Linha;
    }

    public Integer getColuna() {
        return Coluna;
    }

    public void setColuna(Integer Coluna) {
        this.Coluna = Coluna;
    }
    
    @Override   
    public String toString(){
        return Linha + ", " + Coluna;
    }
    
}
