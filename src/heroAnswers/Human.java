package heroAnswers;

import heroQuestions.SuperPower;

/**
 * Some mere mortals are nonetheless "super" heroes thanks to their fearlessness and training.  
 * (Batman is an obvious example)
 * These superheroes never have any superpowers.
 * 
 * @author n5372828 - Ian Daniel
 *
 */
public class Human extends SuperHero {
	
	/**
	 * When born a human superhero has a "plain" identity (e.g. "Bruce Wayne"),
	 * but later in life adopts a secret identity for use when fighting crime (e.g. "Batman").
	 * 
	 * @param realName - The superhero's birth identity
	 * @param secretIdentity - The superhero's assumed identity
	 */
	public Human(String realName, String secretIdentity){
		super(realName, secretIdentity);

	}

	/**
	 * Returns the answer to whether or not a human has a superpower (which is always no).
	 * 
	 * @return Always returns False
	 */
	@Override
	public boolean hasPower(SuperPower queriedPower) {
		return false;
	}

	/**
	 * Returns the sum of a human's superpower (which will always be zero).
	 * 
	 * @return Will always return 0
	 */
	@Override
	public int totalPower() {
		return 0;
	}

}
