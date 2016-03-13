package heroAnswers;

import heroQuestions.SuperPower;

public abstract class SuperHero implements Hero {

	private String trueIdentity;
	private String alterEgo;
	private String activeIdentity;
	
	public SuperHero(String trueIdentity, String alterEgo){
		this.trueIdentity = trueIdentity;
		this.alterEgo = alterEgo;
		
		activeIdentity = trueIdentity;
	}
	
	@Override
	public String currentIdentity() {
		return activeIdentity;
	}

	@Override
	public void switchIdentity() {
		if (activeIdentity == trueIdentity){
			activeIdentity = alterEgo;
		} else {
			activeIdentity = trueIdentity;
		}
	}
	
	/**
	 * Tests to see whether or not the superhero currently has the queried superpower.
	 * 
	 * @param queriedPower - the superpower in question
	 * @return true iff the superhero currently has this power
	 */
	public abstract boolean hasPower (SuperPower queriedPower);

	/**
	 * Returns the superhero's current "total power" which is the sum of the numerical values associated with all of
	 * their currently held powers.
	 * 
	 * @return The numerical sum of the superhero's current powers
	 */
	public abstract int totalPower ();
}
