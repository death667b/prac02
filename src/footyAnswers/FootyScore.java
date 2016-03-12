/**
 * 
 */
package footyAnswers;

/**
 * @author Ian Daniel
 * @version 1.0
 */
public class FootyScore {

	final int pointsPerGoal = 6;
	final int pointsPerBehind = 1;
	
	private int numberGoals;
	private int numberBehinds;
	
	/**
	 * Holds details for a AFL football team
	 */
	public FootyScore(){
		numberGoals = 0;
		numberBehinds = 0;
	}
	
	/**
	 * Adds one to the number of Goals kicked
	 */
	public void kickGoal(){
		numberGoals++;
	}

	/**
	 * Adds on to the number of behind kicked
	 */
	public void kickBehind(){
		numberBehinds++;
	}
	
	/**
	 * Returns a formatted string of the number of 
	 * Goals, Behind and total Points
	 * @return String Team Score
	 */
	public String sayScore(){
		String returnString = "";
		
		returnString = numberGoals + ", ";
		returnString += numberBehinds + ", ";
		returnString += this.getPoints();
		
		return returnString;
	}
	
	/**
	 * Returns the total points for a team
	 * @return int Total points for a team
	 */
	public int getPoints(){
		int returnPoints = 0;
		
		returnPoints = numberBehinds * pointsPerBehind;
		returnPoints += numberGoals * pointsPerGoal;
		
		return returnPoints;
	}
	
	/**
	 * Determins who is winning the game
	 * @param otherPlayer Requires the FootyScore object for the opposing team
	 * @return Boolean False if other team is winning
	 */
	public Boolean inFrontOf(FootyScore otherPlayer){
		Boolean isWinning = false;
		
		if (this.getPoints() > otherPlayer.getPoints()){
			isWinning = true;
		}
		
		return isWinning;
	}
}
