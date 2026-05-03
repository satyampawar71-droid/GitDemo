package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass4 {

@Test
public void webloginHomeLoan() 
{
	
	System.out.println("webloginHome");
	Assert.assertTrue(false);
}
	
@Test
public void MobileloginHomeLoan() 
{
	System.out.println("MobileloginHome");
	
}	

@BeforeMethod
public void loginAPIHomeLoan() 
{
	System.out.println("I'm the before Method Annotaion i will execute at class level and before each method of that class4");
	
}	


}
