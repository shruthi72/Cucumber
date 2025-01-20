package stepDefinitions;

import io.cucumber.java.Before;

public class hooks {
	
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("setup entries in NetBanking database$$$");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup()
	{
		System.out.println("setup entries in Mortgage database$$$");
	}

	
//Order: Before(Hooks) -> Background --> Scenario --> After	

}
