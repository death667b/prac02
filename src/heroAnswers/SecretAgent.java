package heroAnswers;

/**
 * A secret agent has both a name and an alias, usually a number. In addition, secret agents have a favourite gadget
 * 
 * @author n5372828 - Ian Daniel
 *
 */
public class SecretAgent implements Hero {
	private String trueName;
	private String codeName;
	private String gadget;
	private String activeIdentity;
	
	/**
	 * A secret agent has a civilian identity and a codename used when on a mission, as well as a number of gadgets.
	 * 
	 * @param trueName - the secret agents's real name
	 * @param codeName - the secret agent's identity within his or her organisation
	 * @param gadget - the secret agent's favourite gadget
	 */
	public SecretAgent(String trueName, String codeName, String gadget){
		this.trueName = trueName;
		this.codeName = codeName;
		this.gadget = gadget;
		activeIdentity = trueName;
	}
		
	@Override
	public String currentIdentity() {
		return activeIdentity;
	}

	@Override
	public void switchIdentity() {
		if (activeIdentity == trueName){
			activeIdentity = codeName;
		} else {
			activeIdentity = trueName;
		}
	}

	/**
	 * Identifies the secret agent's favourite gadget.
	 * 
	 * @return a description of the gadget
	 */
	public String getGadget(){
		return gadget;
	}
}
