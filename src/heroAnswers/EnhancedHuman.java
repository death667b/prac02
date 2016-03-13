package heroAnswers;

import heroQuestions.SuperPower;

/**
 * An "enhanced" human is born as a mere mortal (e.g., Billy Batson) but later gains the 
 * ability to turn into a superhero (e.g., Captain Marvel) through some magical or science 
 * fiction plot device (e.g., by saying the name of the wizard "Shazam"). Therefore, when 
 * an enhanced human switches into their secret (super) identity they also acquire a 
 * whole collection of superpowers, and lose them again when changing back to their 
 * real (non-super) identity.
 * 
 * @author n5372828 - Ian Daniel
 *
 */
public class EnhancedHuman extends SuperHero {

	private SuperPower[] acquiredPowers;
	private SuperPower[] activePowers;
	private String enhancedIdentity;

	/**
	 * A superhero of the "enhanced human" variety begins life with no superpowers 
	 * and a mortal identity, but also has an "enhanced" (super) identity, in which 
	 * he/she acquires several superpowers.
	 * 
	 * @param normalIdentity - the superhero's initial, mortal identity
	 * @param enhancedIdentity - the superhero's "enhanced" identity, when transformed
	 * @param acquiredPowers - the superpowers the hero acquires when in his/her "enhanced" identity
	 */
	public EnhancedHuman(String normalIdentity, String enhancedIdentity, 
			SuperPower[] acquiredPowers) {
		super(normalIdentity, enhancedIdentity);
		
		this.enhancedIdentity = enhancedIdentity;
		this.acquiredPowers = acquiredPowers;
		this.activePowers = new SuperPower[] {};
		
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		for (SuperPower findPower: acquiredPowers){
			if (findPower.equals(queriedPower)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int totalPower() {
		int returnPower = 0;
		
		for (SuperPower findPower: activePowers){
			returnPower += findPower.getValue();
		}
		
		return returnPower;
	}
	
	/**
	 * Switches the hero's current identity to their alter ego. When a hero changes 
	 * to their "super" identity they gain all of their powers. When they switch back 
	 * to their normal identity they lose them again.
	 */
	@Override
	public void switchIdentity(){
		super.switchIdentity();
		
		if (currentIdentity() == enhancedIdentity) {
			activePowers = acquiredPowers;
		} else {
			activePowers = new SuperPower[] {};
		}
	}

}
