package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@NetBanking")
	public void netBankingSetup()
	{
		System.out.println("*********************");
		System.out.println("Set up the entries in Netbanking database");
		System.out.println("This is final Commit into develop branch from GitDummy");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Clear the entries");
		System.out.println("Another changes from GitStuff in Develop branch");
	}
	
	@Before("@Mortagage")
	public void mortgageSetup()
	{
		System.out.println("Set up the entries in Mortgage database");
	}
}
