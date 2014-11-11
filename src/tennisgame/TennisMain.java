package tennisgame;

/**
 *
 * @author gaston
 */
public class TennisMain {

    public static void main(String[] args) {
        // TODO code application logic here
        TennisGame game =  new TennisGame("Gaston", "Federer");
        // Game típico 
        System.out.println("Partido Tipico");
        
        System.out.println("Saca Gastón");
        game.playerOneScores(); //15 0
        System.out.println("Score=" + game.getScore());
        
        if(game == null){
            System.out.println("Esto no esta probado ... ");
        }
        
        System.out.println("Saca Federer");
        game.playerTwoScores();//15 15
        System.out.println("Score=" + game.getScore());
        
        System.out.println("Saca Gastón");
        game.playerOneScores(); //30 15
        System.out.println("Score=" + game.getScore());
        
        System.out.println("Saca Federer");
        game.playerTwoScores();//30 30
        System.out.println("Score=" + game.getScore());
       
        System.out.println("Saca Gastón");
        game.playerOneScores(); //40 30
        System.out.println("Score=" + game.getScore());
        
        System.out.println("Saca Federer");
        game.playerOneScores(); //win 30    
        System.out.println(game.getScore());
    }
    
}
