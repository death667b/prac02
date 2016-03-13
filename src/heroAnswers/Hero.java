package heroAnswers;

/**
 * Interface hero contains current identity and switch identity
 * 
 * @author n5372828 Ian Daniel
 *
 */
public interface Hero { 
	
	/**
	 * Returns the hero's currently identity in a printable format
	 * 
	 * @return The hero's current identity
	 */
	public String currentIdentity();
	
	/**
	 * Switches the hero's current identity
	 */
	public void switchIdentity();
}
