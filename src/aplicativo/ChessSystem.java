
package aplicativo;

import jogoXadrez.XadrezJogo;



public class ChessSystem {

    
    public static void main(String[] args) {
       
           XadrezJogo xadrezjogo = new XadrezJogo();
           UI.imprimiTabuleiro((xadrezjogo.getPieces()));
           
       
    }
    
}
