package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("*********************");
		System.out.println("Set up the entries in Netbanking database");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Clear the entries");
	}
	
	@Before("@Mortagage")
	public void mortgageSetup()
	{
		System.out.println("Set up the entries in Mortgage database");
	}
}
