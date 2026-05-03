package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass2 {
	
	@Test(enabled=false)
	public void demo2() 
	{
		System.out.println("Hellow 2nd class");
	}

	@BeforeTest
	public void Prerequesite() 
	{
		
		System.out.println("This prerequesite anootation will run first");

	}
	
	@Test(groups= {"Smoke"})
	public void Third () 

	{
		System.out.println("This is class3 last method using group functions");	

	}
	
}
