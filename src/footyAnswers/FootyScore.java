/**
 * 
 */
package footyAnswers;

/**
 * @author Ian Daniel
 *
 */
public class FootyScore {

	final int pointsPerGoal = 6;
	final int pointsPerBehind = 1;
	
	private int numberGoals;
	private int numberBehinds;
	
	public FootyScore(){
		numberGoals = 0;
		numberBehinds = 0;
	}
	
	public void kickGoal(){
		numberGoals++;
	}

	public void kickBehind(){
		numberBehinds++;
	}
	
	public String sayScore(){
		String returnString = "";
		
		returnString = numberGoals + ", ";
		returnString += numberBehinds + ", ";
		returnString += this.getPoints();
		
		return returnString;
	}
	
	public int getPoints(){
		int returnPoints = 0;
		
		returnPoints = numberBehinds * pointsPerBehind;
		returnPoints += numberGoals * pointsPerGoal;
		
		return returnPoints;
	}
	
	public Boolean inFrontOf(FootyScore otherPlayer){
		Boolean isWinning = false;
		
		if (this.getPoints() > otherPlayer.getPoints()){
			isWinning = true;
		}
		
		return isWinning;
	}
}
