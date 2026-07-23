package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGClass1 {

	
	@AfterTest
	
	public void ExecuteLast () 

	{
		System.out.println("This After Test will run as we used after Test Annotation here");
		System.out.println("This is after the code download from Gihub and making some modification");
		System.out.println("System.out.println(\"This After Test will run as we used after Test browser");
		System.out.println("System.out.println(\"This After Test will run as we used after Test Log file");
		System.out.println("System.out.println(\"This After Test will run as we used after Test Error Report");
		System.out.println("System.out.println(\"This After Test will run as we used after Test Happy Path");
	}	
	
	@AfterSuite
	public void envsent()
	{
		System.out.println("I'm the last number one @after suite");
	}

@Parameters({"URL"})
@Test
public void Zdemo (String url) 

{
	System.out.println("Hello");	
	System.out.println(url);
}	
@Test(dependsOnMethods= {"Zdemo"})
public void Second () 

{
	System.out.println("Bye");	

}	
@Test(groups= {"Smoke"})
public void Third () 

{
	System.out.println("This is class1 3rd method using group functions");	

}	
	
	
	

	
}
