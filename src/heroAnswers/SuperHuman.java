package heroAnswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import heroQuestions.SuperPower;

/**
 * A superhuman is born with "powers and abilities far beyond those of mortal 
 * men" (e.g., the Amazonian Wonder Woman) but usually adopts a mild-mannered 
 * secret identity (e.g., "Diana Prince"). However, under certain circumstances 
 * a superhuman may lose some of their powers (e.g., when Superman is exposed 
 * to kryptonite), may later regain lost ones, or may acquire entirely new powers.
 * 
 * @author n5372828 - Ian Daniel
 *
 */
public class SuperHuman extends SuperHero {

	ArrayList<SuperPower> currentPowers;
	
	/**
	 * When born a superhuman has a real (super) name and later adopts a secret (non-super) 
	 * identity. A superhuman also has a collection of innate superpowers at birth. 
	 * If the given collection of superpowers contains duplicates the unnecessary ones 
	 * are ignored.
	 * 
	 * @param realName - the superhuman's true identity
	 * @param secretIdentity - the superhuman's adopted identity
	 * @param innatePowers - the superhuman's original superpowers
	 */
	public SuperHuman(String realName, String secretIdentity,
			SuperPower[] innatePowers) {
		super(realName, secretIdentity);

        this.currentPowers = new ArrayList<SuperPower>(Arrays.asList(innatePowers));
	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		for (SuperPower findPower: currentPowers){
			if (findPower.equals(queriedPower)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int totalPower() {
		int returnPower = 0;
		
		for (SuperPower findPower: currentPowers){
			returnPower += findPower.getValue();
		}
		
		return returnPower;
	}

	/**
	 * Adds the given collection of new superpowers to those already possessed. No 
	 * action is taken for powers already owned by the superhero, i.e., a superhero 
	 * can't have the same superpower twice.
	 * 
	 * @param newPowers - the new powers to be added, if not already owned
	 */
	public void acquirePowers(SuperPower[] newPowers){
		for (SuperPower addPower: newPowers){
			if (currentPowers.contains(addPower)){
				// Do nothing
			} else {
				currentPowers.add(addPower);
			}
		}
	}
	
	/**
	 * Removes the given collection of superpowers from those possessed by the 
	 * superhero. No action is taken for powers not currently owned by the superhero, 
	 * i.e., you can't take away a power that the hero doesn't have.
	 * 
	 * @param oldPowers - the existing powers to be retracted, if currently possessed
	 */
	public void losePowers(SuperPower[] oldPowers){
		for (SuperPower removePower: oldPowers){
			for (Iterator<SuperPower> listedPower = currentPowers.listIterator();
					listedPower.hasNext(); ){
				SuperPower superObj = listedPower.next();
				if (removePower == superObj){
					listedPower.remove();
				}
			}
		}
	}
}
