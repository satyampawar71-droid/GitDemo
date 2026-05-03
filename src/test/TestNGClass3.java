package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGClass3 {

@Test
public void webloginCar() 
{
	
	System.out.println("webloginCar");
}
	
@Test
public void MobileloginCar1() 
{
	System.out.println("MobileloginCar1");
	
}	

@BeforeSuite
public void envsent()
{
	System.out.println("I'm the numbe rone @Before suite");
}


@Parameters( {"URL","APIKEY/Username"})
@Test
public void MobileloginCar2(String urlname , String Key) 
{
	System.out.println("MobileloginCar2");
	System.out.println(urlname);
	System.out.println(Key);
}


@Test(dataProvider="getdata")
public void MobileloginCar3(String Username , String Password) 
{
	System.out.println("MobileloginCar3");
	System.out.println(Username);
	System.out.println(Password);
}	

@DataProvider

public Object[][] getdata()
{
	//1st combination-username and password-Good Credit Histry
	//2nd st combination-username and password-No Good Credit Histry
	//3rd fraudulent credit history
	Object[][] data= new Object[3][2];
	//1st Set
	data[0][0]="1ststesername";
	data[0][1]="1stpassword";
	//coulmn in the row are the values for that particular combinations
	//2nd Set
	data[1][0]="2ndtesername";
	data[1][1]="2ndpassword";
	//3rd Set
	data[2][0]="3rdtesername";
	data[2][1]="3rdpassword";
	return data;
}

@Test
public void loginAPICar() 
{
	System.out.println("loginAPICar");
	
}	
@Test(groups= {"Smoke"})
public void Third () 

{
	System.out.println("This is class3 3rd method using group functions");	

}	


}
