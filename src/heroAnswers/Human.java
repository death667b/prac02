package heroAnswers;

import heroQuestions.SuperPower;

public class Human extends SuperHero {

	public Human(String realName, String secretIdentity){
		super(realName, secretIdentity);

	}

	@Override
	public boolean hasPower(SuperPower queriedPower) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int totalPower() {
		// TODO Auto-generated method stub
		return 0;
	}

}
