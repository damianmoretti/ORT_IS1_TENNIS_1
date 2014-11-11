package tennisgame;

/**
 * Este es un ejercicio de pruebas unitarias y no sobre el uso de TDD.
 * El objetivo es crear casos de prueba unitaria utilizando las técnicas de caja
 * negra y luego escribir casos de prueba en Junit.
 * 
 * Tambien se quiere que los estudiantes utilicen el plug in Jacocover para 
 * ver la cobertura de los casos de prueba
 * @author gaston
 */
public class TennisGame {

	private int playerOneScore = 0;
	private int playerTwoScore = 0;
	private String playerTwoName;
	private String playerOneName;
	
	public TennisGame(String playerOneName, String playerTwoName) {
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
	}

    
    public String getScore() {

		if (hasWinner()) {
			return playerWithHighestScore() + " wins";
		}
		
		if (hasAdvantage()) { 
			return "Advantage " + playerWithHighestScore(); 
		}
		
		if (isDeuce())
			return "Deuce";
		
		if(playerOneScore == playerTwoScore) {
			return translateScore(playerOneScore) + " all";
		}
		
		return translateScore(playerOneScore) + "," + translateScore(playerTwoScore);
	}

	private boolean isDeuce() { //error deberia decir playerOneScore >= 3
		return playerOneScore >= 4 && playerTwoScore == playerOneScore;
	}
	
	private String playerWithHighestScore() {
		if (playerOneScore > playerTwoScore) {
			return playerOneName;
		} else {
			return playerTwoName;
		}
	}
	
	private boolean hasWinner() {
		if(playerTwoScore >= 4 && playerTwoScore >= playerOneScore + 2 )
			return true;
        // error en la sentencia de abajo  if(playerOneScore >= 4 && playerOneScore >= playerTwoScore + 2)
		if(playerOneScore >= 4 && playerOneScore >= playerTwoScore )
			return true;
		return false;
	}
	
	private boolean hasAdvantage() {
                // error en la sentencia de abajo esta es correcta if (playerTwoScore >= 4 && playerTwoScore == playerOneScore + 1)	
                if (playerTwoScore >= 4 && playerTwoScore == playerOneScore )
			return true;
		if (playerOneScore >= 4 && playerOneScore == playerTwoScore + 1)
			return true;
		
		return false;

	}

	public void playerOneScores() {
		playerOneScore++;
	}

	public void playerTwoScores() {
		playerTwoScore++;
	}
	
	private String translateScore(int score) {
		switch (score) {
		case 3:
			return "Forty";
		case 2:
			return "Thirty";
		case 1: 
			return "Fifteen";
		case 0:
			return "Love";
                		}
		throw new IllegalArgumentException("Illegal score: " + score);
	}
}
